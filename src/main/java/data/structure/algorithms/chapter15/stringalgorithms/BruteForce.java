package data.structure.algorithms.chapter15.stringalgorithms;

/**
 * 字符串匹配算法:蛮力破解法
 * 算法思路是：对于文本T中每个可能的位置,检查默认P是否匹配。
 *     由于T的长度为n,所以有n-m-+1个可选的位置来比较.
 *     因为模式P的长度为m,所以T的最后m-1个位置无需要检查。
 *     时间复杂度为O((n-m+1)*m)≈O(n x m)
 *
 * Created by wy on 9/27/17.
 */
public class BruteForce {

    public static int bruteForceStringMatch(int T[], int n, int[] P, int m) {

        for (int i = 0; i < n - m; i++) {
            int j = 0;
            while (j < m && P[j] == T[i + j]) {
                j++;
            }
            if (j == m) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] T = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 15, 16, 17, 18};
        int n = T.length;
        int[] P = {7, 8, 9};
        int m = P.length;

        int res = bruteForceStringMatch(T,n,P,m);

        System.out.println(res);

    }
}
