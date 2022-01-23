package com.ciftci.leetcode.datastructures2;

import java.util.HashMap;
import java.util.Map;

public class E2_169_MajarityElement {

    public static void main(String[] args) {

    }

    public int majorityElement(int[] nums) {

        Map<Integer,Integer> frequencyMap = new HashMap<>();
        for (int i = 0;i < nums.length;i++){
            int currnrtNumber = nums[i];
            frequencyMap.put(currnrtNumber, frequencyMap.getOrDefault(currnrtNumber, 0) + 1);
        }

        int result = 0;
        for (Integer key : frequencyMap.keySet()){
            Integer frequency = frequencyMap.get(key);

            if(frequency > nums.length / 2) {
                result = key;
                break;
            }
        }

        return result;
    }

}
