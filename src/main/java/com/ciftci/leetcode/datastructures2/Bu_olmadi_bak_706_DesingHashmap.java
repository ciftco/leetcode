package com.ciftci.leetcode.datastructures2;

import java.util.HashMap;
import java.util.Map;

public class Bu_olmadi_bak_706_DesingHashmap {


    class MyHashMap {

        Map<Integer,Integer> store;
        public MyHashMap() {
            store = new HashMap<>();
        }

        public void put(int key, int value) {
            store.put(key, value );
        }

        public int get(int key) {

            if(!store.containsKey(key))
                return -1;

            return store.get(key);
        }

        public void remove(int key) {
            store.remove(key);
        }
    }

}
