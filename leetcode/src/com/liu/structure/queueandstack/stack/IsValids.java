package com.liu.structure.queueandstack.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName: IsValids
 * @Auther: yu
 * @Date: 2018/11/6 21:40
 * @Description:有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 */
public class IsValids {
    public static void main(String[] args){
      String a ="()[]{}";
      boolean res = isValid(a);
      System.out.println(res);
    }


    public static  boolean isValid(String s) {
        Stack<String> stack = new Stack<String>();
        List<String>  le = new ArrayList<>();
        le.add("{");
        le.add("[");
        le.add("(");
        List<String>  ri = new ArrayList<>();
        ri.add("}");
        ri.add("]");
        ri.add(")");
        for (int i = 0; i <s.length() ; i++) {
            if(le.contains(String.valueOf(s.charAt(i)))){
                stack.push(String.valueOf(s.charAt(i)));
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                String m = stack.pop();
                if(ri.indexOf(String.valueOf(s.charAt(i))) != le.indexOf(m)){
                    return  false;
                }
            }
        }

        if(!stack.isEmpty()){
            return  false;
        }
        return  true;
    }

}
