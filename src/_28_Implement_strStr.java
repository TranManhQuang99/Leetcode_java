public class _28_Implement_strStr {
    public static int strStr(String haystack, String needle) {
        int z = 0;
        int result = 0;
        for (int i =0;i< haystack.length();i++){
            while(haystack.charAt(i)==needle.charAt(z) && z<  needle.length() -1 ){
                i++;
                z++;
                result = i - needle.length() +1 ;
            }
            if (z == needle.length() -1){
                break;
            }
        }
        return  result;

    }
    public static void main(String[] args){
        System.out.println(strStr("heoll","ll"));
    }

}
