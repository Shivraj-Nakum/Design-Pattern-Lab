
public class CakeDecorator implements cake {
    cake decoratedCake;

    public CakeDecorator(cake decoratedCake){
        this.decoratedCake = decoratedCake;
    }

    @Override
    public void makeCake() {
        decoratedCake.makeCake();
    }
}
