
public class OrderingState implements FoodOrderState{

    @Override
    public void takeOrder(FoodOrder fo) {
        fo.setState(new PreparingState());
        System.out.println("order taken");
    }

    @Override
    public void prepareOrder(FoodOrder fo) {
        System.out.println("order can not be prepared until it is taken");
    }

    @Override
    public void deliveredOrder(FoodOrder fo) {
        System.out.println("order can not be delivered until it is prepared");
    }
}
