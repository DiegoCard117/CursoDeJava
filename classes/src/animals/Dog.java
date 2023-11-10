package animals;

public class Dog {
    public String name;
    public String color;
    public String fell;
    public double weight;

    public void woof() {
        System.out.println(this.name + ": Au Au" );
    }

    public String catchBall() {
        return "bolinha pega";
    }

    public String felling(String action) {
        if (action.equals("carinho")) {
            this.fell = "feliz";
        } else if (action.equals("chute")) {
            this.fell = "triste";
        } else {
            this.fell = "esperando";
        }
        return this.name + " esta " + this.fell;
    }

}
