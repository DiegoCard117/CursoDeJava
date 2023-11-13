package animals;

public abstract class Animal {
    protected String name;
    protected String color;
    protected String fell;
    protected double weight;

    public Animal(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public String getName() {
        return name;
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

    public String getFell() {
        return fell;
    }

    public void setFell(String fell) {
        this.fell = fell;
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
