package isp.lab7.safehome;

import java.util.Objects;

public class AccessKey {
    private String pin;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AccessKey)) return false;
        AccessKey accessKey = (AccessKey) o;
        return Objects.equals(getPin(), accessKey.getPin());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPin());
    }

    public String getPin() {
        return pin;
    }

    public AccessKey(String pin) {
        this.pin = pin;
    }
}
