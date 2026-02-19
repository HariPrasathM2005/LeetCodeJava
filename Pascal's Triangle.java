/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.techwebdocs.pascaltriangle118;

/**
 *
 * @author mohar
 */
import java.util.*;
import java.io.*;
public class PascalTriangle118 
{
    public static List<Integer> Term(int n,List<Integer> prev)
    {
        List<Integer> val=new ArrayList<>();
        if(n==0)
        {
            val.add(1);
        }
        else
        {
            val.add(1);
            for(int i=0;i<n-2;i++)//6  0,1,2,3
            {
                val.add(prev.get(i)+prev.get(i+1));
            }
            val.add(1);
        }
        return val;
    }
    public static List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> Pascal=new ArrayList<>();
        List<Integer> Sub=new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            if(i>=1)
                Sub=Term(i+1,Pascal.get(i-1));
            else if(i==0)
                Sub.add(1);
            Pascal.add(Sub);
            
            System.out.println();
        }
        Display(Pascal);
        return Pascal;
    }
    public static void Display(List<List<Integer>> Pascal)
    {
        for(int i=0;i<Pascal.size();i++)
        {
            for(int j=0;j<Pascal.get(i).size();j++)
            {
                System.out.print(Pascal.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        List<List<Integer>> pascal=new ArrayList<>();
        pascal=generate(5);
        System.out.println();
        Display(pascal);
    }
}
