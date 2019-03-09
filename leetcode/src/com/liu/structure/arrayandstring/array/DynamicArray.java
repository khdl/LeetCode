package com.liu.structure.arrayandstring.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName: DynamicArray
 * @Auther: yu
 * @Date: 2018/10/23 21:41
 * @Description:动态数组（就是java中提供的集合容器）
 */
public class DynamicArray {

        public static void main(String[] args) {
            List<Integer> v0 = new ArrayList<>();
            List<Integer> v1;

            Integer[] a = {0, 1, 2, 3, 4};
            v1 = new ArrayList<>(Arrays.asList(a));

            List<Integer> v2 = v1;
            List<Integer> v3 = new ArrayList<>(v1);

            System.out.println("The size of v1 is: " + v1.size());;

            System.out.println("The first element in v1 is: " + v1.get(0));

            System.out.print("[Version 1] The contents of v1 are:");
            for (int i = 0; i < v1.size(); ++i) {
                System.out.print(" " + v1.get(i));
            }
            System.out.println();
            System.out.print("[Version 2] The contents of v1 are:");
            for (int item : v1) {
                System.out.print(" " + item);
            }
            System.out.println();

            v2.set(0, 5);
            System.out.println("The first element in v1 is: " + v1.get(0));
            v3.set(0, -1);
            System.out.println("The first element in v1 is: " + v1.get(0));

            Collections.sort(v1);

            v1.add(-1);
            v1.add(1, 6);

            v1.remove(v1.size() - 1);
        }

}
