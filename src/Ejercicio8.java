public class Ejercicio8 {
    static void main() {
        int[] array = {8,-4,7,191,-223,90,5,12,72,-23};
        int sumatoriopositivo = 0;
        int sumatorionegativo = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sumatoriopositivo = sumatoriopositivo + array[i];

            }else{
                sumatorionegativo = sumatorionegativo + array[i];

            }
        }System.out.println("La suma es: " + sumatoriopositivo);
         System.out.println("La suma es: " + sumatorionegativo);
    }
}
