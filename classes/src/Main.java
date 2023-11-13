import animals.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Kira", "Yellow", 999999);

        dog1.woof();

        String bolinha = dog1.catchBall();
        System.out.println(bolinha);

        System.out.println(dog1.felling(""));
    }
}