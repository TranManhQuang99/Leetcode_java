public class bubble_sort {

    public static void bubble_sort(int[] array){
        int n = array.length;

        for(int i= 0; i < n; i++){
            boolean isSorted = true;
            for(int j = 0; j < n-i-1; j++){

                if(array[j] > array[j+1]){
                    isSorted = false;

                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            printArray(i, array);

            if(isSorted){
                break;
            }


        }
    }

    public static void printArray(int no, int[] array){
        System.out.printf("%d: ",no);
        for(int i =0;i < array.length;i ++){
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] array = {1,2,3,4,5,7,6};
        bubble_sort(array);
    }

}
