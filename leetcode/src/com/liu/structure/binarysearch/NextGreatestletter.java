package com.liu.structure.binarysearch;

/**
 * @ClassName: NextGreatestletter
 * @Auther: yu
 * @Date: 2019/1/11 16:49
 * @Description:  寻找比目标字母大的最小字母
 * 给定一个只包含小写字母的有序数组letters 和一个目标字母 target，寻找有序数组里面比目标字母大的最小字母。
 */
public class NextGreatestletter {
    /**
     * 这种方法时间复杂度为O(n),可用二分提高效率
     * @param letters
     * @param target
     * @return
     */
    public char nextGreatestLetter(char[] letters, char target) {
        if(target>=letters[letters.length-1]) {
            return letters[0];
        }
        for(int i=0;i<letters.length;i++) {
            if(letters[i]>target) {
                return letters[i];
            }
        }
        return letters[0];
    }
}
