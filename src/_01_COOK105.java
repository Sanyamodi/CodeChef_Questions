import java.util.*;
public class _01_COOK105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int countC = 0, countO = 0, countD = 0;
            int countE = 0, countH = 0, countF = 0;

            int n = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            for (int i = 0; i < n; i++) {
                String word = sc.nextLine();
                for (char ch : word.toCharArray()) {
                    if (ch == 'c') countC++;
                    else if (ch == 'o') countO++;
                    else if (ch == 'd') countD++;
                    else if (ch == 'e') countE++;
                    else if (ch == 'h') countH++;
                    else if (ch == 'f') countF++;
                }
            }

            // Divide by required frequency for each letter in "codechef"
            countC /= 2;
            countE /= 2;

            int meals = Math.min(countC, Math.min(countO,
                    Math.min(countD, Math.min(countE,
                            Math.min(countH, countF)))));

            System.out.println(meals);
        }
    }
}
