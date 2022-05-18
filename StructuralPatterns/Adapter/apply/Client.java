package StructuralPatterns.Adapter.apply;

public class Client {
    private ConnectAdapter connectAdapter;

    public Client(ConnectAdapter connectAdapter) {
        this.connectAdapter = connectAdapter;
    }

    public void setConnectAdapter(ConnectAdapter connectAdapter) {
        this.connectAdapter = connectAdapter;
    }

    public void voltConnect() {
        connectAdapter.voltConnect();
    }
}
