package leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class 颜色分类 {

    @Test
    public void test(){
        int[] nums = new int[]{1,4,6,0,0,8,0};
        sortColors(nums);
    }
    // 刷油漆的思路，遍历每个元素刷次2，
    // 222222222222222222222
    // 碰到几个比2小的从前面刷几次1
    // 111111111111122222222
    // 碰到几个比1小的从前面刷几次0
    // 000000111111122222222
    public void sortColors(int[] nums) {
        int n0 = 0, n1 = 0;
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            nums[i] = 2;
            if(num < 2){
                nums[n1++] = 1;
            }
            if(num < 1){
                nums[n0++] = 0;
            }
            for (int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
}
