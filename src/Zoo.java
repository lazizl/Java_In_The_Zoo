public class Zoo {

    public static void main(String[] args) {
        //make and run a main method
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");
        Unicorn Rarity = new Unicorn("Rarity");
        Rarity.eat("Marshmallows");
        Giraffe Gemma = new Giraffe("Gemma");
        Gemma.eat("leaves");
        Gemma.eat("meat");
        Bee Stinger = new Bee("Stinger");
        Stinger.eat("pollen");
        Stinger.eat("ice");
        Animal[] animals = {tigger, Stinger, pooh, Rarity, Gemma};
        Zookeeper zoe = new Zookeeper("Zoe");
        zoe.feedAnimals(animals,"steak");
    }
}