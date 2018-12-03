package com.liu.hash;

import java.util.Arrays;

/**
 * @ClassName: MyHashSet
 * @Auther: yu
 * @Date: 2018/12/3 21:09
 * @Description:设计哈希集合
 * 不使用任何内建的哈希表库设计一个哈希集合
 */
public class MyHashSet {

    private  boolean[]  set ;
    public MyHashSet() {
        set = new boolean[100000] ;
    }

    public void add(int key) {
       set[key] = true;
    }

    public void remove(int key) {
        if(set[key] ){
            set[key] = false;
        }
    }

    public boolean contains(int key) {
        return  set[key];
    }
}
