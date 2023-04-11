//STATE INTERFACE

public interface FoodOrderState {
    void takeOrder(FoodOrder fo);
    void prepareOrder(FoodOrder fo);
    void deliveredOrder(FoodOrder fo);
}
