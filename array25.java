public class array25 {

    public static void main(String[] args) {

        int[] nums = {2,2,3,4,5,6};

        int maxCount = 0;
        int maxElement = nums[0];

        for (int i = 0; i < nums.length; i++) {

            int count = 0;

            for (int j = 0; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxElement = nums[i];
            }
        }

        System.out.println("Most Frequent Element: " + maxElement);
        System.out.println("Frequency: " + maxCount);
    }
}
