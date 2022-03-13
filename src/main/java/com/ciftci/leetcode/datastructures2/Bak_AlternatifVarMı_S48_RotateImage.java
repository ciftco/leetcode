package com.ciftci.leetcode.datastructures2;

import java.util.HashMap;
import java.util.Map;

public class Bak_AlternatifVarMı_S48_RotateImage {

    //https://leetcode.com/problems/rotate-image/


    public void rotate(int[][] matrix) {

        Map<String, Integer> backingStore = new HashMap<>();
        int length = matrix.length;

        for(int i = 0; i < length;i++){
            for (int j = 0; j < length; j++){
                int value = matrix[i][j];
                String key = String.format("%d,%d", j, length - (i + 1));
                backingStore.put(key, value);
            }
        }

        for(int i = 0; i < length;i++){
            for (int j = 0; j < length; j++){
                String key = String.format("%d,%d", i, j);
                Integer value = backingStore.get(key);
                matrix[i][j] = value;
            }
        }
    }

}
