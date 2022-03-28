import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _1672_Richest_Customer_Wealth {
    public static int maximumWealth(int[][] accounts) {
        int richest;
        List<Integer> Quang = new ArrayList<>();
        for (int j = 0; j < accounts.length; j++) {
            richest = 0;
            for (int i = 0; i < accounts[j].length; i++) {
                richest += accounts[j][i];
                System.out.println("i=" + i + ":" + richest);
                Quang.add(richest);
            }

        }
        int result = Collections.max(Quang);
        return result;
    }

    public static void main(String[] args) {

        int diem[][] = {{1, 2}, {3, 4}, {5, 6}};
        System.out.println(maximumWealth(diem));
    }
}
