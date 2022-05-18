package CreationalPatterns.Builder;

public class SmartPhone_ori {
    private String CPU, RAM, OS;

    public SmartPhone_ori(String CPU, String RAM, String OS) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.OS = OS;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }
}
