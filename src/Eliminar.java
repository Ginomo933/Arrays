import java.util.Arrays;

public class Eliminar {
    static void main() {
        int[] array = {5,7,8,1,2,6,3};
        int posicionABorrar = 0;


        for (int i = posicionABorrar; i < array.length -1 ; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = 0;
        System.out.println(Arrays.toString(array));
    }
}

