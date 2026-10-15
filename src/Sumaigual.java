import java.util.Scanner;

public class Sumaigual {

    static void main() {
        int[] array = {5,7,8,1,2,6,7,5,3};
        int numero = 0;

        System.out.println("Introduce número: ");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            for (int j = i +1;  j< array.length; j++){
                if (array[i] + array[j] == numero){
                    System.out.println("El numero " + array[i] + " y " + array[j]+ " suman el número introduido");
                }
            }
        }
    }
}
