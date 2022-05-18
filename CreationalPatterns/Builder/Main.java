package CreationalPatterns.Builder;

public class Main {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone.Builder("CPU","RAM","OS").setA("A").build();
    }
}
