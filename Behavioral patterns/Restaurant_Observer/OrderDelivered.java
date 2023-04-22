
public class OrderDelivered extends Observer{
    public OrderDelivered(RestaurantOrder restaurantOrder) {
        this.restaurantOrder = restaurantOrder;
        this.restaurantOrder.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Order deliver");
    }
}
