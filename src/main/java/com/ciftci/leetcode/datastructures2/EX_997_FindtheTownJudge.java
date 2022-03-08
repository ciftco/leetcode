package com.ciftci.leetcode.datastructures2;

import java.util.HashMap;
import java.util.Map;

public class EX_997_FindtheTownJudge {

    //https://leetcode.com/problems/find-the-town-judge/

    public static void main(String[] args) {

    }

    public int findJudge(int n, int[][] trust) {

        if(n == 1){
            return 1;
        }

        boolean[] trustsSomeOne = new boolean[n];

        Map<Integer, Integer> trustCountMap = new HashMap<>();
        
        for (int index = 0; index < trust.length; index++){
            int person = trust[index][0];
            int trustedPerson = trust[index][1];

            trustsSomeOne[person - 1] = true;
            trustCountMap.put(trustedPerson, trustCountMap.getOrDefault(trustedPerson, 0) +1);
        }

        for (int i = 0; i< n; i++){
            boolean trusts = trustsSomeOne[i];
            if(trusts)
                continue;;
            if(!trustCountMap.containsKey( i + 1)) {
                continue;
            }

            Integer trustCount = trustCountMap.get(i + 1);
            if (trustCount == n - 1) {
                return i + 1;
            }
        }

        return -1;
        
    }

}
