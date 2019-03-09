package com.liu.structure.queueandstack.queue;

import java.util.*;

/**
 * @ClassName: TurntableLock
 * @Auther: yu
 * @Date: 2018/11/6 9:03
 * @Description: 打开转盘锁
 * 用BFS进行遍历
 */
public class TurntableLock {
    public static void main(String[] args) {
       String[] deadends = {"8887","8889","8878","8898","8788","8988","7888","9888"};
       String target = "8888";
       int res = openLock(deadends,target);
       System.out.println(res);
    }

    public static int openLock(String[] deadends, String target) {
        int res = 0;
        Set<String> dead = new HashSet<>(Arrays.asList(deadends));
        Set<String> visited = new HashSet<>();
        String init = "0000";
        if (dead.contains(init) || dead.contains(visited)) {
            return -1;
        }
        Queue<String> queue1 = new LinkedList<>();
        Queue<String> queue2 = new LinkedList<>();
        queue1.offer(init);
        while (!queue1.isEmpty()) {
            String cur = queue1.poll();
            if (cur.equals(target)) {
                return res;
            }
            List<String> nexts = getNexts(cur);
            for (String next : nexts) {
                if (!dead.contains(next) && !visited.contains(next)) {
                    visited.add(next);
                    queue2.offer(next);
                }
            }

            if (queue1.isEmpty()) {
                res++;
                queue1 = queue2;
                queue2 = new LinkedList<>();
            }
        }

        return -1;
    }

    private  static  List<String> getNexts(String cur) {
        List<String> nexts = new LinkedList<>();
        for (int i = 0; i < cur.length(); i++) {
            char ch = cur.charAt(i);
            char newCh = ch == '0' ? '9' : (char) (ch - 1);
            StringBuilder builder = new StringBuilder(cur);
            builder.setCharAt(i, newCh);
            nexts.add(builder.toString());

            newCh = ch == '9' ? '0' : (char) (ch + 1);
            builder = new StringBuilder(cur);
            builder.setCharAt(i, newCh);
            nexts.add(builder.toString());
        }
        return nexts;
    }
}

