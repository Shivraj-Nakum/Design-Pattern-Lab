
public class Main {
    public static void main(String[] args) {

        cake decoration1 = new CherryDecorator(new RedVelvet());

        cake decoration2 = new CherryDecorator(new BlackForest());

        decoration1.makeCake();

        System.out.println("#######################################");

        decoration2.makeCake();

    }
}
