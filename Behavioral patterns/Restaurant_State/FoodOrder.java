//CONTEXT CLASS

public class FoodOrder {
    private FoodOrderState state;

    public FoodOrder() {
        state = new OrderingState();
    }

    public void setState(FoodOrderState state) {
        this.state = state;
    }

    public void takeOrder() {
        state.takeOrder(this);
    }

    public void prepareOrder() {
        state.prepareOrder(this);
    }

    public void deliveredOrder() {
        state.deliveredOrder(this);
    }
}