package isp.lab6.exercise3;

import java.util.Objects;

public class User {
    private String username;
    private String password;
    public String getUsername() {
        return username;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean equals(User user) {
        if (Objects.equals(this.hashCode(), user.hashCode())) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsername(), password);
    }
}
