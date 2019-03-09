package com.liu.structure.arrayandstring.doublepointer;

/**
 * @ClassName: DoublePointTec
 * @Auther: yu
 * @Date: 2018/10/29 19:33
 * @Description: 双指针技巧
 * 场景之一从两端向中间迭代数组。 
 */
public class DoublePointTec {

	public static void main(String[] args) {
	  int[] v ={1,2,3,4,5,6};
	  int res[] = reverse(v,v.length);
	  System.out.println(res);
	}
	public static int[] reverse(int[] v, int N) {
	    int i = 0;
	    int j = N - 1;
	    while (i < j) {
	        swap(v, i, j);  
	        i++;
	        j--;
	    }
	    return v;
	}
	private static void swap(int[] v, int i, int j) {
		int tmp = v[i];
		v[i] = v[j];
		v[j] = tmp;
		
	}
}
