package com.liu.structure.hash;

import java.util.Arrays;

/**
 * @ClassName: MyHashMap
 * @Auther: yu
 * @Date: 2018/12/3 21:19
 * @Description:设计哈希映射
 * 不使用任何内建的哈希表库设计一个哈希映射
 */
public class MyHashMap {
    int[] map = new int[100001];
    /** Initialize your data structure here. */
    public MyHashMap() {
        Arrays.fill(map,-1);
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        map[key] = value;
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
         return  map[key];
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
         map[key] = -1;
    }
}
