package StructuralPatterns.Adapter.ori;

class Client_220 extends Volt220{}
class Client_110 extends Volt110{}

public class Main {
    public static void main(String[] args) {
        Client_220 client_220 = new Client_220();
        client_220.voltConnect();

        Client_110 client_110 = new Client_110();
        client_110.voltConnect();
    }
}


