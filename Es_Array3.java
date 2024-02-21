import java.util.Arrays;

public class Es_Array3 {
    public static void main(String args[]) {
        int[] numbers = {1,1,2,2,3,3,4,4};
        
        System.out.println(Arrays.toString(removeDup(numbers)));
    }
    public static int[] removeDup (int[] array){
        int[] array2 = new int[array.length];
        int j = 0;

        for (int i = 0; i < array.length -1; i++){
            if(array[i] != array[i+1]){
                array2[j] = array[i];
                j++;
            }else {
                array2[j] = -1;
                j++;
            }
        }
        array2[j] = array[j];
        return array2;
    }
}