public class _88_Merge_Sorted_Array_On {
    public static int merge(int[] n1, int m, int[] n2, int n) {
        int i = m -1;
        int j = n -1;
        int k = (m+n) -1;

        while(k>=0){
            if(j < 0){
                n1[k] = n1[i];
            }if(i <0){
                n1[k] = n2[j];
            }if(n1[i]>n2[j]){
                n1[k] = n1[i];
                i--;
            }if(n1[i]<n2[j]){
                n1[k] = n2[j];
                j--;
            }
            k--;
        }
        return k;



    }
    public static void main(String[] args){
        int [] n1 = {1,2,3,0,0,0};
        int [] n2 = {2,5,6};

        int val = 2;
        merge(n1,3,n2,3);
        System.out.println("done");
    }
}
