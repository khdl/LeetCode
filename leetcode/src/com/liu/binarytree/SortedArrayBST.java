package com.liu.binarytree;

import com.liu.queueandstack.stack.TreeNode;

/**
 * @ClassName: SortedArrayBST
 * @Auther: yu
 * @Date: 2019/2/15 18:33
 * @Description: 将有序数组转换为二叉搜索树
 */
public class SortedArrayBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums,0,nums.length-1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int left, int right) {
        if(left>right) {
            return null;
        }
        int mid=(left+right)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=sortedArrayToBST(nums,left,mid-1);
        root.right=sortedArrayToBST(nums,mid+1,right);
        return root;
    }
}
