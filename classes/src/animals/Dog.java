package animals;

public class Dog {
    //atributtes
    private String name;
    private String color;
    private String fell;
    private double weight;

    //constructors


    public Dog(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
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

    public void woof() {
        System.out.println(this.name + ": Au Au" );
    }

    public String catchBall() {
        return "bolinha pega";
    }

    public String felling(String action) {
        switch (action) {
            case "carinho" -> this.fell = "feliz";
            case "chute" -> this.fell = "triste";
            default -> this.fell = "esperando";
        }
        return this.name + " esta " + this.fell;
    }
}
