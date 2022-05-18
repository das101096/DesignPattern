package BehavioralPattern.Visitor;

public class Client {
    public static void main(String[] args) {
        Element elementA = new ElementA();
        elementA.accept(new VisitiorA());

        Element elementB = new ElementB();
        elementB.accept(new VisitorB());

        elementA.accept(new VisitorB());
        elementB.accept(new VisitiorA());
    }
}
