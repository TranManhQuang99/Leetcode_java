import java.util.ArrayList;
import java.util.Arrays;

public class insertion_sort {
    public static void insertion_sort(int[] a){
        int n = a.length;
        for (int i = 1;i<n;i++){
            int ai = a[i];
            int j = i -1;
            while(j>=0 && a[j]>ai){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = ai;
            System.out.println(Arrays.toString(a));
        }
    }

    public static void main(String[] args){
        int[] arr = {5,6,2,1,9,7};
        insertion_sort(arr);

    }
}
