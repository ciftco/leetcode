package com.ciftci.leetcode.datastructures2;

import java.util.ArrayList;
import java.util.List;

public class EX_155_MinStack {

    public static void main(String[] args) {

    }

    class MinStack {

        private List<Integer> backingStore ;
        public MinStack() {
            this.backingStore = new ArrayList<>();
        }

        public void push(int val) {
            backingStore.add(val);
        }

        public void pop() {
            Integer integer = backingStore.get(backingStore.size() - 1);
            backingStore.remove(backingStore.size() - 1);

        }

        public int top() {
            Integer integer = backingStore.get(backingStore.size() - 1);
            backingStore.remove(backingStore.size() - 1);
            return integer;
        }

        public int getMin() {
            int min = Integer.MAX_VALUE;
            for (int val : backingStore){
                if(val < min)
                    min = val;
            }
            return min;
        }
    }

}
