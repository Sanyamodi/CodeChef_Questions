import java.util.*;
public class _03_LngstSubstringWithoutRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int n = s.length();
        int[] freq = new int[256]; // For all ASCII characters
        int left = 0, right = 0, maxLen = 0;

        while (right < n) {
            char rChar = s.charAt(right);
            freq[rChar]++;

            // If duplicate, shrink from left
            while (freq[rChar] > 1) {
                char lChar = s.charAt(left);
                freq[lChar]--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }

        System.out.println(maxLen);
    }
}
