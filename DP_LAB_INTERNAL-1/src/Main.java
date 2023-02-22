
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        //CREATING OBJECT-1 and LOADING its DATA
        EsportsCountry obj1 = new EsportsCountry();
        obj1.setCountryName("USA");
        obj1.loadData();

        //Cloning object with some changes in it
        EsportsCountry obj2 = obj1.clone();
        obj2.setCountryName("India");
        obj2.getGame().remove(2);

        //PRINTING OBJECTS

        System.out.println(obj1);

        System.out.println(obj2);

    }

}
