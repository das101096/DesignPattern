package BehavioralPattern.Command;

public class Client {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        AirConditioner airConditioner = new AirConditioner();
        AirConditionerOnCommand airConditionerOnCommand = new AirConditionerOnCommand(airConditioner);
        AirConditionerOffCommand airConditionerOffCommand = new AirConditionerOffCommand(airConditioner);

        remoteControl.setCommand(lightOnCommand);
        remoteControl.doAction();
        remoteControl.setCommand(lightOffCommand);
        remoteControl.doAction();

        remoteControl.setCommand(airConditionerOnCommand);
        remoteControl.doAction();
        remoteControl.setCommand(airConditionerOffCommand);
        remoteControl.doAction();

    }
}
