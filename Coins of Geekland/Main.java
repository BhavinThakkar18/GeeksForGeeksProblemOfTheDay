package com.company;

import com.sun.source.tree.Tree;

import java.util.Queue;
import java.util.Vector;

public class Main {

    public static int  Maximum_Sum(int[][] mat, int N, int K)
    {
        int sum=0;
        int ans=0;
        for(int i=0;i<N-K+1;i++)
        {
            for(int j=0;j<N-K+1;j++)
            {
                int rowSum=0;
                int columSum=0;
                sum=0;
                for(int k=i;k<i+K;k++)
                {
                    for(int l=j;l<j+K;l++)
                    {
                        //System.out.print(" "+mat[k][l]);
                        sum+=mat[k][l];
                    }
                    ans=Integer.max(ans,sum);
                    //System.out.println(ans);
                    //System.out.println();
                }
                //System.out.println();
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        // write your code here
        int[][] mat = new int[][]{{1, 1, 1, 1, 1}, {2, 2, 2, 2, 2}, {3, 8, 6, 7, 3}, {4, 4, 4, 4, 4}, {5, 5, 5, 5, 5}};
       System.out.println(Maximum_Sum(mat,5,3));
    }
}