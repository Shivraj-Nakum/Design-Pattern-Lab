public class Originator {
    private String order;

    public void setOrder(String order){
        this.order = order;
    }

    public String getOrder(){
        return order;
    }

    public Memento saveStateToMemento(){
        return new Memento(order);
    }

    public void getStateFromMemento(Memento memento){
        order = memento.getOrder();
    }
}
