package com.liu.structure.queueandstack.stack;

import java.util.*;

/**
 * @ClassName: CloneGragh
 * @Auther: yu
 * @Date: 2018/11/7 22:46
 * @Description:克隆图
 * 克隆一张无向图，图中的每个节点包含一个 label （标签）和一个 neighbors （邻接点）列表 。
 */
public class CloneGragh {
    private HashMap<Integer, UndirectedGraphNode> map = new HashMap<>();
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        return clone(node);
    }
    private UndirectedGraphNode clone(UndirectedGraphNode node) {
        if(node == null){
            return  null;
        }
        if(map.containsKey(node.label)){
            return map.get(node.label);
        }
        UndirectedGraphNode clone = new UndirectedGraphNode(node.label);
        map.put(clone.label,clone);
        for(UndirectedGraphNode neighbor : node.neighbors){
            clone.neighbors.add(clone(neighbor));
        }
        return  clone;
    }

}
class UndirectedGraphNode {
      int label;
      List<UndirectedGraphNode> neighbors;
      public UndirectedGraphNode(int x) {
           label = x;
          neighbors = new ArrayList<UndirectedGraphNode>();
      }
  };

