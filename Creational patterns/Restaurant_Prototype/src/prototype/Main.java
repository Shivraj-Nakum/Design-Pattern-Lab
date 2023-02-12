package prototype;

public class Main{

    public static void main(String[] args) throws CloneNotSupportedException {

        Restaurant obj = new Restaurant();
        obj.setHotelName("Seasons");
        obj.LoadData();

        Restaurant obj2 = obj.clone();
        obj2.getItems().remove(1);
        obj2.setHotelName("Sankalp");

        System.out.println(obj);
        System.out.println(obj2);

    }
}
