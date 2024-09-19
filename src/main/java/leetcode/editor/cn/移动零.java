package leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class 移动零 {

    @Test
    public void test(){
        int[] nums = new int[]{1,4,6,0,0,8,0};
        moveZeroes(nums);
    }
    public void moveZeroes(int[] nums) {
        int n = nums.length, left = 0, right = 0;
        while(right < n){
            if(nums[right] != 0){
                System.out.println(left);
                System.out.println(right);
                swap(nums, left, right);
                left++;
            }
            right++;
            for (int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
