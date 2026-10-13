import java.util.Scanner;
public class Ejercicio10 {

    static void main() {

        int[] array = {8,4,7,191,90,5,12,72,23,24};
        int numero = 0;
        int posicion = -1;
        System.out.println("Introduce número a buscar en el array: ");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();

        for (int i = 0; i < array.length; i++) {
        if (numero == array[i]){
            posicion = i;
            break;
        }
        }
        System.out.println("Esta en la posición: " + posicion);
        System.out.println("Si es -1, no se encuentra en el array");
    }
}
