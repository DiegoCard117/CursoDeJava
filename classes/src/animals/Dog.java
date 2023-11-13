package animals;

public class Dog extends Animal{
    //atributtes
    static int quantityOfDogs;

    //constructors

    public Dog(String name, String color, double weight) {
        super(name, color, weight);

        quantityOfDogs ++;
    }

    //methods
    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static int getQuantityOfDogs() {
        return quantityOfDogs;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

}
