public class Giraffe extends Animal {

    public Giraffe(String n) {
        super("Gemma", "leaves");
    }

    public void eat(String food) {
        System.out.println(name + " eats " + food);
        if (food.equals(favoriteFood)) {
            System.out.println("Yum!! " + name + " wants more " + food);
        }else{
            System.out.println("Yuck!! " + name + " will not eat " + food);
            Sleep();
        }
    }
}

