package CreationalPatterns.ProtoType;

public class Main_ori {
    public static void main(String[] args) {
        Rectangle_ori r1 = new Rectangle_ori(3,3,5,5);
        r1.whoAmI();

        Rectangle_ori r2 = new Rectangle_ori(r1.getStartX(), r1.getStartY()
                ,r1.getWidth(), r1.getHeight());
        r2.setStartX(r2.getStartX() + 1);
        r2.whoAmI();
    }
}
