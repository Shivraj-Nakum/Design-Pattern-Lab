
public class CookedState implements FoodOrderState{

    @Override
    public void takeOrder(FoodOrder fo) {
        System.out.println("order has already been taken");
    }

    @Override
    public void prepareOrder(FoodOrder fo) {
        System.out.println("order has already been cooked");
    }

    @Override
    public void deliveredOrder(FoodOrder fo) {
        fo.setState(new DeliveredState());
        System.out.println("Order is being delivered");
    }
}
