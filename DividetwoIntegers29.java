/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.techwebdocs.dividetwointegers29;

/**
 *
 * @author mohar
 */
import java.util.*;
import java.io.*;
public class DividetwoIntegers29 {
    public static int divide(int dividend, int divisor) 
    {
        //System.out.println(dividend);
        if(dividend==Integer.MIN_VALUE && divisor==-1)
            return -(dividend+1);
        else if(dividend==Integer.MIN_VALUE && divisor==1)
            return Integer.MIN_VALUE;
        
        int q=0;
        int div1;
        int div2;

        
        if(dividend<0)
        {
            div2=divisor;
            if(divisor>0)//divisor=-2
                div2=-divisor;
            System.out.println(div2+" "+dividend);
            for(int i=dividend;i<0;i=i-div2)
            {
                if(i<=div2)
                    q=q-1;
            }
            if(divisor<0)
                q=-q;
            return q;
        }
        else
        {
            if(divisor==Integer.MIN_VALUE)
                return 0;
            div2=divisor;
            System.out.println(div2);
            if(divisor<0)
                div2=-divisor;
            System.out.println(div2);
            for(int i=dividend;i>0;i=i-div2)
            {
                if(i>=div2)
                    q=q+1;
            }
            if(divisor<0)
                q=-q;
            return q;
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        int q=divide(1038925803,2147483647);
        System.out.println(q);
    }
}
