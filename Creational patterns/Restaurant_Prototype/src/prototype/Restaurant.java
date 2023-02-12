package prototype;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String hotelName;
    List<FoodItem> items = new ArrayList<>();

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public List<FoodItem> getItems() {
        return items;
    }

    public void setItems(List<FoodItem> items) {
        this.items = items;
    }

    public void LoadData(){
        for (int i = 1; i <4; i++) {
            FoodItem f = new FoodItem();
            f.setPrice(i);
            f.setItem("FoodItem"+i);
            getItems().add(f);
        }
    }

    @Override
    public String toString() {
        return "Restaurant {" + " hotelName='" + hotelName + '\'' + ", items=" + items + '}';
    }

    @Override
    protected Restaurant clone() throws CloneNotSupportedException {
        Restaurant r = new Restaurant();
        for (FoodItem f : this.getItems()){
            r.getItems().add(f);
        }
        return r;
    }
}
