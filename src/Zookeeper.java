public class Zookeeper {

    private String name;

    public Zookeeper(String name){
        this.name = name;
    }

    public void feedAnimals ( Animal[] animals, String food){
        System.out.println(name + " is feeding " + food + " to " + + animals.length + " out of "+ Animal.population + " animals");
        for(int i = 0; i < animals.length; i++){
            animals[i].eat(food);
        }
    }
}
