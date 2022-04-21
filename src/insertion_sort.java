import java.util.ArrayList;
import java.util.Arrays;


public class insertion_sort {
    public static void insertion_sort(int[] arr){
        int n = arr.length;
        for(int i = 1; i<n -1; i++){
            int current = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j] > current){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = arr[i];

            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args){
        int[] arr = {5,6,2,1,9,7};
        insertion_sort(arr);

    }
}
