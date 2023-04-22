import java.util.ArrayList;
import java.util.List;

public class RestaurantOrder {

    private List<Observer> observers = new ArrayList<Observer>();
    private int order;

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}