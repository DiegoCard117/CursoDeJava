import animals.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Kira", "Yellow", 999999);
        System.out.println(Dog.getQuantityOfDogs());

        System.out.println(dog1.felling(""));
    }

}