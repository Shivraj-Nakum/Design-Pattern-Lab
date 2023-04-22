
public class Client {
    public static void main(String[] args) {

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setOrder("Order #1");
        originator.setOrder("Order #2");
        careTaker.add(originator.saveStateToMemento());

        originator.setOrder("Order #3");
        careTaker.add(originator.saveStateToMemento());

        originator.setOrder("Order #4");
        System.out.println("Current Order: " + originator.getOrder());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved Order remaining to serve: " + originator.getOrder());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved Order remaining to serve: " + originator.getOrder());
    }
}