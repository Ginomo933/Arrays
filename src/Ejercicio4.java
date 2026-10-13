public class Ejercicio4 {
    static void main() {
        int[] b = {3,7,1,8,4,5,6,4,9,10};
        double suma = 0;

        for (int i = 0; i < b.length; i++) {
            suma = suma + b[i];
        }
        System.out.println("La media es: " + suma / b.length);
    }
}
