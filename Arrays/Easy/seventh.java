package Arrays.Easy;


public class seventh {
    public static void main(String[] args) {
        int[] nums = {1,2,4,5};

        boolean[] isPresent = new boolean[nums.length + 2];

        for (int num : nums) {
            isPresent[num] = true;
        }

        for (int i = 1; i <= nums.length + 1; i++) {
            if (!isPresent[i]) {
                System.out.println(i);
                break;
            }
        }
    }
}
