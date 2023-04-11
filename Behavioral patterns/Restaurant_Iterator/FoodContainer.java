
public class FoodContainer implements iContainer{
    private String food[] = {"burger","pizza","sandwich","dhokla"};

    @Override
    public iIterator getIterator() {
        return new FoodIterator();
    }

    private class FoodIterator implements iIterator{
        private int index;

        @Override
        public boolean hasnext() {
            if (index < food.length){
                return true;
            }else {
                return false;
            }
        }

        @Override
        public Object next() {
            if (this.hasnext()){
                return food[index++];
            }else {
                return null;
            }
        }
    }
}
