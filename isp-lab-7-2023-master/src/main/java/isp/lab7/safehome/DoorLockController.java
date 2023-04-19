package isp.lab7.safehome;

import java.util.*;

public class DoorLockController implements ControllerInterface{
    private Map<Tenant, AccessKey> validAccess = new HashMap<>();
    private Door door = new Door();
    private int wrongAttempts = 0;
    private List<AccessLog> accessLogs = new ArrayList<>();

    public DoorLockController() {
        validAccess.put(new Tenant(MASTER_TENANT_NAME), new AccessKey(MASTER_KEY));
    }

    public DoorStatus enterPin(String pin) throws Exception {
        String name = "unknown";
        if(Objects.equals(pin, ControllerInterface.MASTER_KEY)) wrongAttempts = 0;
        if(validAccess.containsValue(new AccessKey(pin)) && wrongAttempts < 3) wrongAttempts = 0;
        if(wrongAttempts < 2) {
            if (validAccess.containsValue(new AccessKey(pin))) {
                for (Map.Entry<Tenant, AccessKey> entry : validAccess.entrySet())
                    if (Objects.equals(entry.getValue(), new AccessKey(pin)))
                        name = entry.getKey().getName();
                if (door.getStatus() == DoorStatus.OPEN) door.lockDoor();
                else
                    door.unlockDoor();
                wrongAttempts = 0;
                accessLogs.add(new AccessLog(name, "enterPin", door.getStatus(), ""));
                return door.getStatus();
            } else {
                accessLogs.add(new AccessLog(name, "enterPin", door.getStatus(), "InvalidPinException"));
                wrongAttempts ++;
                throw new InvalidPinException();
            }
        }
        else {
            accessLogs.add(new AccessLog(name, "enterPin", door.getStatus(), "TooManyAttemptsException"));
            wrongAttempts ++;
            throw new TooManyAttemptsException();
        }
    }

    @Override
    public void addTenant(String pin, String name) throws Exception {
        if (validAccess.containsKey(new Tenant(name))) throw new TenantAlreadyExistsException();
        validAccess.put(new Tenant(name), new AccessKey(pin));
    }

    @Override
    public void removeTenant(String name) throws Exception {
        if (!validAccess.containsKey(new Tenant(name))) throw new TenantNotFoundException();
        validAccess.remove(new Tenant(name));
    }

    public List<AccessLog> getAccessLogs() {
        return accessLogs;
    }

    public Map<Tenant, AccessKey> getValidAccess() {
        return validAccess;
    }
}
