package BehavioralPattern.Visitor;

public class VisitiorA implements Visitor{
    @Override
    public void visit(Element element) {
        if(element instanceof ElementA) {
            System.out.println("Visitor A : " + element.getClass());
        } else {
            System.out.println("Element A 객체가 아닙니다.");
        }
    }
}
