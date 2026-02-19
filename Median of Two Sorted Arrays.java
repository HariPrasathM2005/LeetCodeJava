/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.techwebdocs.median;

/**
 *
 * @author mohar
 */
import java.util.Scanner;
import java.io.*;
import java.util.*;
public class Median {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int n=nums1.length+nums2.length;
        int [] arr=new int[n];
        double median;
        for(int i=0;i<nums1.length;i++)
        {
            arr[i]=nums1[i];
        }
        for(int j=0;j<nums2.length;j++)
        {
            arr[j+nums1.length]=nums2[j];
        }
        int temp;
        /*for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();*/
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        /*for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }*/
        if(n%2==0)
        {
            //System.out.println(arr[n/2 -1]);
            //System.out.println(arr[n/2]);
            median=((double)(arr[n/2 -1])+(double)arr[n/2])/2;
        }
        else
        {
            median=arr[n/2];
        }
        return median;
    }
    public static void main(String[] args) {
        Median m=new Median();
        double median;
        int [] num1={1,2};
        int [] num2={3,4};
        median=m.findMedianSortedArrays(num1,num2);
        System.out.print(median);
    }
}
