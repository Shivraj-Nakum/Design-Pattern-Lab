
public class OrderConfirmed extends Observer{
    public OrderConfirmed(RestaurantOrder restaurantOrder) {
        this.restaurantOrder = restaurantOrder;
        this.restaurantOrder.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Order confirm");
    }
}
