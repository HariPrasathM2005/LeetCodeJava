/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.techwebdocs.searchinsert;

/**
 *
 * @author mohar
 */
import java.util.*;
import java.io.*;
public class SearchInsert {

    public static int searchInsert(int[] nums, int target) 
    {
        int num=0;
        for(int i=0;i<nums.length;i++)
        {
            if(target>nums[nums.length-1])
                num=nums.length;
            else
            {
                if(nums[i]==target)
                    num=i;
                else if(target>nums[i] && target<nums[i+1])
                    num=i+1;
                
            }
            
        }
        return num;
    }
    public static void main(String[] args) 
    {
        int[] nums={1,2,4,5,7};
        int res;
        res=searchInsert(nums,8);
        System.out.println(res);
    }
}
