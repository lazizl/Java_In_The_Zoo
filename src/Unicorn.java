public class Unicorn extends Animal {
    public Unicorn(String n){
        super("Rarity","Marshmallows");
        this.name = n;
    }
    public void Sleep(){
        System.out.println(name + " sleeps in a cloud");
    }
}
