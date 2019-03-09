package com.liu.structure.queueandstack.queue;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: QueueIntroduction
 * @Auther: yu
 * @Date: 2018/11/1 18:26
 * @Description: 对列介绍
 */
public class QueueIntroduction {

    private List<Integer> data;

    private int p_start;
    public QueueIntroduction() {
        data = new ArrayList<Integer>();
        p_start = 0;
    }
    public boolean enQueue(int x) {
        data.add(x);
        return true;
    };

    public boolean deQueue() {
        if (isEmpty() == true) {
            return false;
        }
        p_start++;
        return true;
    }

    public int Front() {
        return data.get(p_start);
    }

    public boolean isEmpty() {
        return p_start >= data.size();
    }
}
