package com.liu.structure.arrayandstring.string;

/**
 * @ClassName: FindStr
 * @Auther: yu
 * @Date: 2018/10/27 23:06
 * @Description:实现strStr()
 * 寻找一个字符串在另一个字符串的位置
 */
public class FindStr {
    public static void main(String[] args){
       String haystack = "a";
       String needle = "a";
       int res = strStr(haystack,needle);
       System.out.println(res);
    }

    public static int strStr(String haystack, String needle) {
        /* if("" == needle){
            return  0;
            }
        String reg = ".{1}("+needle+")";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(haystack);
        if(matcher.find()){
            return  matcher.start() + 1;
        }
        return  -1;*/

        if("".equals(needle)){
            return  0;
        }
        char[] h =haystack.toCharArray();
        char[] n =needle.toCharArray();
        int l= h.length;
        int k= n.length;
        if(l<k){
            return  -1;
        }
       for(int i=0; i<= l-k;i++){
           int b =i;
           StringBuilder s = new StringBuilder();
           for (int j = 0; j < k; j++) {
               s.append(String.valueOf(h[b]));
               b++;
           }
           if(needle.equals(s.toString())){
               return  i;
           }
           s = new StringBuilder();
       }
       return -1;

    }
}
