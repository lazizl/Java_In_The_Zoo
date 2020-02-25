public class Bee extends Animal {

    public Bee(String n) {
        super("Stinger", "pollen");
    }

    public void eat(String food) {
        System.out.println(name + " eats " + food);
        if (food.equals(favoriteFood)) {
            System.out.println("Yum!! " + name + " wants more " + favoriteFood);
        }else{
            System.out.println("Yuck!! " + name + " will not eat " + food);
            System.out.println(name + " never sleeps");
        }
    }
}

