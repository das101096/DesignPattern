package StructuralPatterns.Adapter.apply;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(new Volt220());
        client.voltConnect();

        System.out.println();

        client.setConnectAdapter(new Volt110());
        client.voltConnect();
    }
}
