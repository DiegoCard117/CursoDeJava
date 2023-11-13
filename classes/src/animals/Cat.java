package animals;

public class Cat extends Animal{
    static int quantityOfCats;

    public Cat(String name, String color, double weight) {
        super(name, color, weight);
    }

    @Override
    public String toString() {
        return "Cat{}";
    }
}
