package com.liu.queueandstack.summary;

import java.util.*;

/**
 * @ClassName: CanVisitAllRooms
 * @Auther: yu
 * @Date: 2018/11/11 12:21
 * @Description:钥匙和房间
 * BFS
 */
public class CanVisitAllRooms {
    public static void main(String[] args){
        List<List<Integer>> rooms0 = new ArrayList<>();
        List<Integer> room00 = new ArrayList<>();
        room00.add(1);
        List<Integer> room01 = new ArrayList<>();
        room01.add(2);
        List<Integer> room02 = new ArrayList<>();
        room02.add(3);
        List<Integer> room03 = new ArrayList<>();
        rooms0.add(room00);
        rooms0.add(room01);
        rooms0.add(room02);
        rooms0.add(room03);

       CanVisitAllRooms cvar = new CanVisitAllRooms();
       boolean res =cvar.canVisitAllRooms(rooms0);
        System.out.println(res);
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
       /* int n = rooms.size();
        int[] a = new int[n];
        a[0] = 1;
        int cnt = 1;
        Queue<Integer> qt = new LinkedList<>();
        for (int i = 0; i <rooms.get(0).size() ; i++) {
            if(a[rooms.get(0).get(i)] == 0){
                qt.offer(rooms.get(0).get(i));
                a[rooms.get(0).get(i)] = 1;
                cnt++;
            }
        }

        while(!qt.isEmpty()){
            int tmp = qt.poll();
            for(int i=0;i<rooms.get(tmp).size();i++){
                int m = rooms.get(tmp).get(i);
                if(a[m] == 0){
                    a[m] = 1;
                    cnt++;
                    qt.offer(m);
                }
            }
        }
        if(cnt == n){
            return  true;
        }
        return false;*/
        Stack<Integer> todo = new Stack<>();
        todo.add(0);
        HashSet<Integer> done = new HashSet<>();
        done.add(0);
        while (!todo.isEmpty()){
            int i = todo.pop();
            for (Integer j : rooms.get(i)) {
                if(!done.contains(j)){
                    todo.add(j);
                    done.add(j);
                    if(rooms.size() == done.size()){
                        return  true;
                    }
                }
            }
        }
       return rooms.size() == done.size();
    }
}
