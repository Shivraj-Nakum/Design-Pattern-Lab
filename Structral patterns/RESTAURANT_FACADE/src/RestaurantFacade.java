
public class RestaurantFacade {

    Lighting lighting;
    Music music;
    Food food;

    public RestaurantFacade(Lighting lighting , Music music , Food food){
        this.lighting = lighting;
        this.music = music;
        this.food = food;
    }

    public void romanticDinner(){
        lighting.romanticLight();
        music.romanticMusic();
        food.romanticFood();
    }

    public void birthdayDinner(){
        lighting.birthdayLight();
        music.birthdayMusic();
        food.birthdayFood();
    }
}
