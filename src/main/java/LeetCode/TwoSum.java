package LeetCode;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int [] indices=new int[2];
        for(int i=0;i< nums.length; i++ ) {
            int b = target - nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==b) {
                    indices[0]=i;
                    indices[1]=j;
                }
            }
        }
        return indices;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = new TwoSum().twoSum(nums, target);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
