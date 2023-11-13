package animals;

public class Animal {
    protected String name;
    protected String color;
    protected String fell;
    protected double weight;

    public Animal(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    protected void noise() {
        System.out.println(this.name + " make a noise" );
    }

    protected String catchBall() {
        return this.name + " pegou a bolinha";
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
