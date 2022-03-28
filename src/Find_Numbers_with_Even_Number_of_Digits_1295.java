public class Find_Numbers_with_Even_Number_of_Digits_1295 {
    public static int findNumbers(int[] nums) {
        int biendem = 0;
        for (int a : nums){
            if(tinhsochuso(a) %2 == 0){
                biendem++;
            }
        }

        return biendem;
    }

    public static int tinhsochuso(int a){
        int biendem = 0;
        while(a > 0){
            a/=10;
            biendem++;
        }
        return biendem;
    }

    public static void main(String[] args){

        int[] nums = {1,312312,3,23123};

        System.out.println(findNumbers(nums));

    }
}
