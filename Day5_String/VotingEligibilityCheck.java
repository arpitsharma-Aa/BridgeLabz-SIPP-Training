package Day5_String;
public class VotingEligibilityCheck {
    static int[] generateAges(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = 10 + (int)(Math.random() * 90);
        return arr;
    }

    static String[][] canVote(int[] ages) {
        String[][] res = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            res[i][0] = String.valueOf(ages[i]);
            res[i][1] = (ages[i] >= 18 ? "true" : "false");
        }
        return res;
    }

    static void display(String[][] data) {
        for (String[] row : data) System.out.println(row[0] + " " + row[1]);
    }

    public static void main(String[] args) {
        int[] ages = generateAges(10);
        String[][] result = canVote(ages);
        display(result);
    }
}

