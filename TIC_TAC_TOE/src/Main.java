import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        // System.out.print(numberPattern(4));
        // Write your code here
        // first half
        int n = 3;
        int m = n + 2;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m; j++) {
                int digit = n;
                if (j != 1 && j != m && i != 1 && i != m)
                    System.out.print(digit - 1);
                else {
                    System.out.print(digit);
                }
            }
            System.out.print("\n");
        }
    }

    public static ArrayList<ArrayList<Integer>> numberPattern(int n) {

        // Initializing matrix to store the pattern
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>(n);

        for (int i = 0; i < n; i++) {
            ans.add(new ArrayList<Integer>(n));
            for (int j = 0; j < n; j++) {
                ans.get(i).add(-1);
            }
        }

        // Insert '1' into the matrix
        ans.get(0).set(0, 1);

        // For loop to store the rest of the pattern
        for (int i = 1; i < n; i++) {

            // If row equals i and col equals 0 or i then store i in the matrix
            ans.get(i).set(0, i);
            ans.get(i).set(i, i);

            for (int j = 1; j < i; j++) {

                // Store '0' between the two ends of a row

                ans.get(i).set(j, 0);

            }
        }
        // Return the matrix
        return ans;

    }

}
