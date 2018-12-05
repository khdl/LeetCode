package com.liu.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: FindRestaurant
 * @Auther: yu
 * @Date: 2018/12/5 20:49
 * @Description:  两个列表的最小索引总和
 */
public class FindRestaurant {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> map=new HashMap<String,Integer>();
        List<String> list=new ArrayList<String>();
        for(int i=0;i<list1.length;i++) {
            map.put(list1[i], i+1);
        }
        int index=0;
        for(int i=0;i<list2.length;i++) {
            if(map.containsKey(list2[i])) {
                if(index==0) {
                    list.add(list2[i]);
                    index=i+map.get(list2[i]);
                }else if(index==i+map.get(list2[i])) {
                    list.add(list2[i]);
                }else if(index>i+map.get(list2[i])) {
                    list.clear();
                    list.add(list2[i]);
                    index=i+map.get(list2[i]);
                }
            }
        }
        String[] res = new String[list.size()];
        return list.toArray(res);
    }
}
