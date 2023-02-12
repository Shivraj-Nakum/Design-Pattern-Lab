
public class Client {
    public static void main(String[] args) {

        Lighting obj1 = new Lighting();
        Music obj2 = new Music();
        Food obj3 = new Food();

        RestaurantFacade facade = new RestaurantFacade(obj1,obj2,obj3);

        facade.birthdayDinner();

        System.out.println("==============================================");

        facade.romanticDinner();

    }
}
