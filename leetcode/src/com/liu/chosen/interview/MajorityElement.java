package com.liu.chosen.interview;

/**
 * @ClassName: MajorityElement
 * @Auther: yu
 * @Date: 2019/3/9 11:02
 * @Description: 求众数
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int res = 0, cnt = 0;
        for (int num : nums) {
            if (cnt == 0) {
                res = num;
                cnt++;
            } else if(num == res) {
                cnt++;
            } else {
                cnt--;
            }
        }
        return res;
    }

}
