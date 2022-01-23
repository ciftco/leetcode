package com.ciftci.leetcode.algorithm1;

import java.util.LinkedList;
import java.util.List;

public class EX_77_Combinations {

    public static void main(String[] args) {
        EX_77_Combinations program = new EX_77_Combinations();
        program.combine(3,3);
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new LinkedList<>();
        backtrack(list, new LinkedList<>(), n, k, 1);
        return list;
    }

    public void backtrack(List<List<Integer>> list, List<Integer> temp, int n, int k, int start){
        if(temp.size() == k) list.add(new LinkedList<>(temp));

        for(int i = start; i <= n; i++){
            temp.add(i);
            backtrack(list, temp, n, k, ++start);
            temp.remove(temp.size() - 1);
        }
    }
}
