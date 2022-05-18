package BehavioralPattern.Strategy;

interface Product {
    void buyProduct();
}

class Egg implements Product {
    @Override
    public void buyProduct() {
        System.out.println("달걀 비용 : 300원");
    }
}

class Milk implements Product {
    @Override
    public void buyProduct() {
        System.out.println("우유 비용 : 500원");
    }
}

class Ramen implements Product {
    @Override
    public void buyProduct() {
        System.out.println("라면 비용 : 700원");
    }
}

class Client {
    private Product product;

    public Client(Product product) {
        this.product = product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void buyProduct() {
        product.buyProduct();
    }
}

class Main {
    public static void main(String[] args) {
        Client client = new Client(new Egg());
        client.buyProduct();;
        System.out.println("================");
        client.setProduct(new Milk());
        client.buyProduct();;
        System.out.println("================");
        client.setProduct(new Ramen());
        client.buyProduct();;
    }
}