import java.util.Scanner;
import java.util.Arrays;
public class Task1 {
    public static void main(String args[]) {
        int target = new Scanner(System.in).nextInt();
        int[] nums = {1, 3, 5, 6, target};
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                System.out.println(i);
                break;
            }
        }
    }
}
