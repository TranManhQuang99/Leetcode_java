public class _88_Merge_Sorted_Array {
    public void merge(int[] n1, int m, int[] n2, int n) {

        for (int ai : n2){
            chenphantuvaomang(ai, n1, m);
            m++;
        }

    }

    private void chenphantuvaomang(int x, int[] a, int m) {
        boolean timeDuocK = false;
        for (int k = 0; k<m; k++){
            if(a[k]>x){
                timeDuocK = true;

                for (int i = m-1; i >=k;i--){
                    a[i+1] = a[i];
                }
                a[k] = x;

                break;
            }
        }
        if(timeDuocK == false){
            a[m] = x;
        }
    }
}
