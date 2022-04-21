import java.util.Arrays;

public class selection_sort {

    public static void selection_sort(int[] arr){
        int n = arr.length;
        for(int i = 0; i< n; i++){
            int minIndex = i;
            for(int j = i+1; j< n;j++){
                // tim min [i,n]
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }

            }

            if(arr[i] > arr[minIndex]){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
            System.out.println(Arrays.toString(arr));


        }
//        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args){
        int[] arr = {5,1,2,2,9,7};
        selection_sort(arr);

    }
}
