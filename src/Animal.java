public class Animal {
    String name;
    String favoriteFood;

    public Animal(String name, String favoriteFood) {
        this.name = name;
        this.favoriteFood = favoriteFood;
        population++;
    }

    static int population = 0;

    public void Sleep() {
        System.out.println(name + " sleeps for 5 hours");

    }

    public void eat(String food) {
        System.out.println(name + " eats " + food);
        if (food.equals(favoriteFood)) {
                System.out.println("Yum!! " + name + " wants more" +  favoriteFood);
        }else{
            Sleep();
        }
    }
}


