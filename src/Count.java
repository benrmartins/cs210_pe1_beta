import stdlib.StdIn;
import stdlib.StdOut;

public class Count {
    // Entry point [DO NOT EDIT].
    public static void main(String[] args) {
        String s = args[0];
        int l = Integer.parseInt(args[1]);
        String[] a = StdIn.readAllStrings();
        StdOut.println("# of strings of length >= " + l + " = " + stringsOfLength(a, l));
        StdOut.println("frequency(" + s + ") = " + frequencyOf(a, s));
    }

    // Returns the number of strings of length >= l in a.
    private static int stringsOfLength(String[] a, int l) {
        int count = 0;
        // loops through the array
        for (int i = 0; i < a.length; i++) {
            // checks if any word has a greater or equal to than length
            if (a[i].length() >= l) {
                count++;
            }
        }
        return count;
    }

    // Returns the frequency of the string s in a.
    private static int frequencyOf(String[] a, String s) {
        int count = 0;
        // loops through the array of words
        for (int i = 0; i < a.length; i++) {
            // checks if any word equal to s
            if (a[i].equals(s)) {
                count++;
            }
        }
        return count;
    }
}
