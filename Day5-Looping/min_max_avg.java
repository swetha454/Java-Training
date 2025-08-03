import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean first = true;
        int min = 0, max = 0, sum = 0, count = 0;

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n == -1) break;

            if (first) {
                min = max = n;
                first = false;
            } else {
                if (n < min) min = n;
                if (n > max) max = n;
            }

            sum += n;
            count++;
        }

        if (count > 0) {
            double avg = (double) sum / count;
            System.out.println("Min = " + min);
            System.out.println("Max = " + max);
            System.out.println("Sum = " + sum);
            System.out.printf("Average = %.6f\n", avg); // Important: newline after average
        }
    }
}
