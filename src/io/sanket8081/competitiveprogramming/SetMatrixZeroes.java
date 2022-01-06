//https://leetcode.com/problems/set-matrix-zeroes/
package io.sanket8081.competitiveprogramming;

import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeroes {

public void setZeroes(int[][] matrix) {
        
        int rows= matrix.length;
        int cols=matrix[0].length;
        
        Set<Integer> rowSet = new HashSet<Integer>();
        Set<Integer> colSet = new HashSet<Integer>();
        
        for(int row=0;row<rows;row++)
        {
            for(int col=0;col<cols;col++)
            {
                if(matrix[row][col]==0)
                {
                    rowSet.add(row);
                    colSet.add(col);
                }
            }
        }
        
        for(int row=0;row<rows;row++)
        {
            for(int col=0;col<cols;col++)
            {
                if(rowSet.contains(row)||colSet.contains(col))
                {
                    matrix[row][col]=0;
                }
            }
        }
    }
}
