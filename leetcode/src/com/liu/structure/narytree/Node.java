package com.liu.structure.narytree;

import java.util.List;

/**
 * @ClassName: Node
 * @Auther: yu
 * @Date: 2019/2/17 19:46
 * @Description:
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
}
