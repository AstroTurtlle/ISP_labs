package isp.lab7.safehome;

import java.time.LocalDateTime;

public class AccessLog {
    private String tenantName;
    private LocalDateTime dateTime;
    private String operation;
    private DoorStatus doorStatus;
    private String errorMessage;

    @Override
    public String toString() {
        return "AccessLog{" +
                "tenantName='" + tenantName + '\'' +
                ", dateTime=" + dateTime +
                ", operation='" + operation + '\'' +
                ", doorStatus=" + doorStatus +
                ", errorMessage='" + errorMessage + '\'' +
                '}' + '\n';
    }

    public AccessLog(String tenantName, String operation, DoorStatus doorStatus, String errorMessage) {
        this.tenantName = tenantName;
        this.dateTime = LocalDateTime.now();
        this.operation = operation;
        this.doorStatus = doorStatus;
        this.errorMessage = errorMessage;
    }
}
