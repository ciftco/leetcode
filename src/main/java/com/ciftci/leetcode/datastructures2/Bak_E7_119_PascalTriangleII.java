package com.ciftci.leetcode.datastructures2;

import java.util.ArrayList;
import java.util.List;

public class Bak_E7_119_PascalTriangleII {

    public static void main(String[] args) {
        Bak_E7_119_PascalTriangleII item = new Bak_E7_119_PascalTriangleII();
        List<Integer> rowList = item.getRow(10);


    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList();
        for (int i = 0; i <= rowIndex; i++)
            result.add(1);
        for (int i = 1; i < rowIndex; i++)
            for (int j = i; j >0; j--)
                result.set(j, result.get(j-1) + result.get(j));
        return result;
    }

}
