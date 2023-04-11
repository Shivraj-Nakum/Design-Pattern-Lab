public class PreparingState implements FoodOrderState {

    @Override
    public void takeOrder(FoodOrder fo) {
        System.out.println("order has already been taken");
    }

    @Override
    public void prepareOrder(FoodOrder fo) {
        fo.setState(new CookedState());
        System.out.println("order is being prepared");
    }

    @Override
    public void deliveredOrder(FoodOrder fo) {
        System.out.println("order cannot be delivered until it is cooked");
    }
}
