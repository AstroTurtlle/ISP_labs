package isp.lab6.exercise3;

import isp.lab6.exercise3.User;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class LoginSystem {
    private Set<User> users = new HashSet<User>();
    private OnlineStore store = new OnlineStore();
    public void register(String username, String password) {
        users.add(new User(username, password));
    }
    public boolean login(String username, String password) {
        for(User i:users) {
            if(i.hashCode() == new User(username, password).hashCode()) {
                this.store.addSession(username);
                return true;
            }
        }
        return false;
    }
    public boolean logout(String username) {
        if (this.store == null)
            return false;
        for(User user : users) if(Objects.equals(user.getUsername(), username)) {
            if(store.getSessions().containsKey(username)) {
                store.removeSession(username);
                return true;
            }
        }
        return false;
    }

    public Set<User> getUsers() {
        return users;
    }

    public OnlineStore getStore() {
        return store;
    }
}
