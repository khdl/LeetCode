package com.liu.structure.binarytree;

import java.util.PriorityQueue;

/**
 * @ClassName: KthLargest
 * @Auther: yu
 * @Date: 2019/2/12 10:57
 * @Description:  Kth Largest Element in a Stream
 */
public class KthLargest {
    int k;
    PriorityQueue<Integer> queue;
    public KthLargest(int k, int[] nums) {
        this.k  = k;
        queue = new PriorityQueue<>();
        if(nums.length <= k) {
            for(int ele:nums) {
                queue.add(ele);
            }
        }else {
            for(int i = 0;i<k;i++) {
                queue.add(nums[i]);
            }
            for(int i = k;i<nums.length;i++) {
                if(queue.peek()<nums[i]) {
                    queue.poll();
                    queue.add(nums[i]);
                }
            }
        }
    }

    public int add(int val) {
        if(queue.size()<k) {
            queue.offer(val);
        }else if(queue.peek()<val) {
            queue.poll();
            queue.offer(val);
        }
        return queue.peek();
    }
}
