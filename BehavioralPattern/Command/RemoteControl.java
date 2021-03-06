package BehavioralPattern.Command;

public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void doAction() {
        command.execute();
    }
}
