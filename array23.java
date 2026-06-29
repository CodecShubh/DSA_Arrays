public class array23 {

    public static void main(String[] args) {

        int[] a = {3, 4, 4, 4};
        int[] b = {6, 7, 7};

        int i = 0, j = 0;
        int last = Integer.MIN_VALUE;

        while (i < a.length || j < b.length) {

            int val;

            if (j == b.length || (i < a.length && a[i] <= b[j])) {
                val = a[i++];
            } else {
                val = b[j++];
            }

            if (val != last) {
                System.out.print(val + " ");
                last = val;
            }
        }
    }
}

//study the flow of this code neetly
