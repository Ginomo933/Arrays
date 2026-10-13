public class Ejercicio5 {
    static void main() {
        int[] array = {3, 12, 49, 100 ,1, 18, 94, 193, 215, 225, 63};
        int mayor = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > mayor){
                mayor = array[i];
            }
        }
        System.out.println("El mayor es: " + mayor);
    }
}
