package BehavioralPattern.Visitor;

public class VisitorB implements Visitor{
    @Override
    public void visit(Element element) {
        if(element instanceof ElementB) {
            System.out.println("Visitor B : " + element.getClass());
        } else {
            System.out.println("Element B 객체가 아닙니다.");
        }
    }
}
