package StructuralPatterns.Facade;
import StructuralPatterns.Facade.Package.UrlFacade;

public class Client {
    public static void main(String[] args) {
        UrlFacade urlFacade = new UrlFacade("URL");
    }
}
