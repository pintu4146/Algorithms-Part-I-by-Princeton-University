public class TripleSum {
    public static void main(String[] args) {
        int[] a = {30, -40, -20, -10, 40, 0, 10, 5};
        int res = bf_threesum(a); //bf =brute force method
        System.out.println(res);
    }

    private static int bf_threesum(int[] a) {
        int count = 0;
        int len = a.length;
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {
                for (int k =j+1; k < len; k++) {
                    if ((a[i] + a[j] + a[k]) == 0) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
