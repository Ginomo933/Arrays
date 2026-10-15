public class Duplicados {

    static void main() {
        int[] array = {5,7,8,1,2,6,7,5,3};

        for (int i = 0; i < array.length; i++) {
            for (int j = i +1;  j< array.length; j++){
                if (array[i] == array[j]){
                    System.out.println("El numero " + array[i] + " esta duplicado");
                }
            }
        }
    }
}
