
public class OrderCancelled extends Observer{
    public OrderCancelled(RestaurantOrder restaurantOrder) {
        this.restaurantOrder = restaurantOrder;
        this.restaurantOrder.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Order Cancel");
    }
}
