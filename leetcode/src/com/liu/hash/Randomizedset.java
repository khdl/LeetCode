package com.liu.hash;

import java.util.*;

/**
 * @ClassName: Randomizedset
 * @Auther: yu
 * @Date: 2018/12/28 21:29
 * @Description: 常数时间插入、删除和获取随机元素
 */
public class Randomizedset {
    private Map<Integer,Integer> map = new HashMap<>();
    private List<Integer> list = new ArrayList<>();

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
      if(map.containsKey(val)){
          return false;
      }
      map.put(val,list.size());
      list.add(val);
      return  true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
      if(map.containsKey(val) == false){
          return  false;
      }
      int n = map.get(val);
      if(n != list.size() -1){
          int lastVal = list.get(list.size() -1);
          list.set(n,lastVal);
          map.put(lastVal,n);
      }
      list.remove(list.size() -1);
      map.remove(val);
      return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {
       return  list.get(new Random().nextInt(list.size()));
    }
}
