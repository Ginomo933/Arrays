public class Ejercicio9 {
    static void main() {
        int[] array = {8,4,7,191,90,5,12,72,23,24,};
        int pares = 0 ;
        int impares = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                pares++;
            }else{
                impares++;
            }


        }System.out.println("Hay " + pares + " números par");
        System.out.println("Hay " + impares + " números impar");
    }
}
