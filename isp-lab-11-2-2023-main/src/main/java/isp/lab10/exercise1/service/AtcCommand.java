package isp.lab10.exercise1.service;

public class AtcCommand {
    String command;

    public AtcCommand(String command) {
        this.command = command;
    }

    @Override
    public String toString() {
        return "AtcCommand{" +
                "command='" + command + '\'' +
                '}';
    }

    public String getCommand() {
        return command;
    }
}
