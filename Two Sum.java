/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.techwebdocs.twosum;

/**
 *
 * @author mohar
 */
import java.util.Scanner;
import java.io.*;
import java.util.*;
public class TwoSum {
    public int[] twosum(int[] nums, int target)
    {
        int[] num=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target && i!=j)
                {
                    if(i>=j)
                    {
                        num[0]=j;
                        num[1]=i;
                    }
                    else
                    {
                        num[0]=i;
                        num[1]=j;
                    }
           
                }
            }
        }
        return num;
    }
    public static void main(String[] args) {
        TwoSum s=new TwoSum();
        int[] num=new int[2];
        int [] n={3,2,4,2};
        num=s.twosum(n,6);
        for(int i=0;i<num.length;i++)
        {
            System.out.print(num[i]+" ");
        }
    }
}
