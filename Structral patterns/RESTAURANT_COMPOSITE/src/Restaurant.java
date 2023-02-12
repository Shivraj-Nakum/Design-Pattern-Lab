//this is main class for testing composite objects

public class Restaurant {
    public static void main(String[] args) {

        Component sp1 = new Leaf("Tomato_Soup",200);
        Component sp2 = new Leaf("ChilliBean_Soup",250);
        Component str1 = new Leaf("Kabab",300);
        Component str2 = new Leaf("BBQ",350);
        Component th1= new Leaf("Full_Thali",500);

        Composite soup = new Composite("SOUP");
        Composite starter = new Composite("STARTER");
        Composite mainCourse = new Composite("Main_Course");
        Composite fullmenu = new Composite("Full_Menu");

        soup.addComponent(sp1);
        soup.addComponent(sp2);
        starter.addComponent(str1);
        starter.addComponent(str2);
        mainCourse.addComponent(th1);

        fullmenu.addComponent(soup);
        fullmenu.addComponent(starter);
        fullmenu.addComponent(mainCourse);

        fullmenu.showPrice();
        //starter.showPrice();


    }
}
