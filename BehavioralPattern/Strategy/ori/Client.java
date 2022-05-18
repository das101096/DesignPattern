package BehavioralPattern.Strategy.ori;

public class Client {
    public void buyProduct(String product) {
        if(product.equals("달걀")) {
            System.out.println("300원");
        } else if(product.equals("우유")) {
            System.out.println("500원");
        }
    }
}
