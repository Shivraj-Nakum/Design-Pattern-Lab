
public class CherryDecorator extends CakeDecorator{
    public CherryDecorator(cake decoratedCake){
        super(decoratedCake);
    }

    @Override
    public void makeCake() {
        decoratedCake.makeCake();
        setCherryonCake(decoratedCake);
    }

    void setCherryonCake(cake decoratedCake){
        System.out.println("Putting Cherry on Cake 🎂🎂");
    }
}
