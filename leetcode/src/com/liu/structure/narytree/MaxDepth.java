package com.liu.structure.narytree;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: MaxDepth
 * @Auther: yu
 * @Date: 2019/2/23 20:39
 * @Description: Maximum Depth of N-ary Tree
 */
public class MaxDepth {

    public int maxDepth(Node root) {
        if(root == null){
            return 0;
        }
        List<Integer> temp = new ArrayList<>();
        for(int i=0;i<root.children.size();i++){
            temp.add(maxDepth(root.children.get(i)));
        }
        int max = 0;
        for(int i=0;i<temp.size();i++){
            if(temp.get(i)>max) {
                max = temp.get(i);
            }
        }
        return max+1;
    }
}
