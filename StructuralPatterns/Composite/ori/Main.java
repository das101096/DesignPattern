package StructuralPatterns.Composite.ori;

public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        Directory users = new Directory("users");
        File imgA = new File("A.img");
        File imgB = new File("B.img");

        root.addDirectory(users);
        users.addFile(imgA);
        users.addFile(imgB);
    }
}
