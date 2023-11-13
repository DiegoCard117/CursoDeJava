import Lojas.PetShop;
import animals.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Kira", "Yellow", 999999);

        PetShop petshop = new PetShop();

        petshop.shower(dog1);
        System.out.println(dog1.getFell());
    }

}