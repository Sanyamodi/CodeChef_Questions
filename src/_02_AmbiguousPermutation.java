import java.util.*;
public class _02_AmbiguousPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;

            int[] perm = new int[n + 1];  // 1-based indexing
            for (int i = 1; i <= n; i++) {
                perm[i] = sc.nextInt();
            }

            boolean isAmbiguous = true;
            for (int i = 1; i <= n; i++) {
                if (perm[perm[i]] != i) {
                    isAmbiguous = false;
                    break;
                }
            }

            System.out.println(isAmbiguous ? "ambiguous" : "not ambiguous");
        }

    }
}
