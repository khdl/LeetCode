package com.liu.structure.arrayandstring.string;

/**
 * @ClassName: LongestPrefix
 * @Auther: yu
 * @Date: 2018/10/29 18:32
 * @Description: 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 说明：所有输入只包含小写字母 a-z 
 */
public class LongestPrefix {
	public static void main(String[] args) {
	  String[] a ={"flower","flow","flight"};
	  String res = longestCommonPrefix(a);
	  System.out.println(res);
	}
    public static String longestCommonPrefix(String[] strs) {
       String res ="";
       if(null == strs || strs.length == 0 ){
    	   return res;
       }
       if( strs.length == 1){
    	   return strs[0];
       }
       int min = strs[0].length();
       for(int i =1;i < strs.length; i++){
    	  if(strs[i].length() < min){
    		  min = strs[i].length();
    	  }
       }
       for(int i= 0;i < min;i++ ){
    	   boolean f =true;
    	   for(int j=0;j < strs.length -1;j++){
    		   if(strs[j].charAt(i) !=strs[j+1].charAt(i)  ){
    			  f=false; 
    		   }
    	   }
    	   if(f == true){
    		   res+=String.valueOf(strs[0].charAt(i));
    	   }else{
    		  break;
    	   }
       }
      	
       return res;
    }

}
