import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        * int[] numbers = {1,2,3,4,5};
            int cont = 1;
            for(int i = 0; i < numbers.length; i++) {
            numbers[i] = cont++ ;
            System.out.println(numbers[i]);
            }
        * */
        //segundo jeito de mostrar array
        //System.out.println(Arrays.toString(numbers));

        int[] numbers = {1, 2, 3, 4, 5};
        int maior = numbers[0];
        int menor = numbers[0];
        float media = (float) 0;

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] > maior) {
                maior = numbers[i];
            }
            if(numbers[i] < menor) {
                menor = numbers[i];
            }
            media += numbers[i];
        }
        System.out.println("maior: " + maior);
        System.out.println("menor: " + menor);
        System.out.println("media: " + media / numbers.length);
    }
}