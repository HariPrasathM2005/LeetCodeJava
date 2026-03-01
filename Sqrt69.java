/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.techwebdocs.sqrt69;

/**
 *
 * @author mohar
 */
import java.util.*;
import java.io.*;
public class Sqrt69 
{   
    public static int length(int num)
    {
        int length=0;
        while(num>0)
        {
            length=length+1;
            num=num/10;
        }
        return length;
    }
    public static int getnum(int num,String ind)
    {
        String res="";
        int Res=0,l;
        l=ind.length();
        String str_num=String.valueOf(num);
        //System.out.println("String: "+str_num);
        //System.out.println("length: "+l);
        if(l==2)
        {
            res=res+str_num.charAt(Character.getNumericValue(ind.charAt(0)));
            res=res+str_num.charAt(Character.getNumericValue(ind.charAt(1)));
        }
        else
            res=res+str_num.charAt(Character.getNumericValue(ind.charAt(0)));
        Res=Integer.parseInt(res);
        //System.out.println("Integer(trim): "+Res);
        return Res;
    }
    public static List<Integer> getarr(int num,int l)
    {
        List<Integer> nums=new ArrayList<>();
        int Sub;
        if(l%2==1)
        {
            Sub=getnum(num,"0");
            nums.add(Sub);
        }
        else if(l%2==0)
        {
            Sub=getnum(num,"01");
            nums.add(Sub);
        }
        if(l%2==0)
        {
            int ind1=2,ind2=3;
            for(int i=0;i<(l/2)-1;i++)
            {
                Sub=getnum(num,String.valueOf(ind1)+String.valueOf(ind2));
                nums.add(Sub);
                ind1=ind1+2;
                ind2=ind2+2;
            }
        }
        else if(l%2==1)
        {
            int ind1=1,ind2=2;
            for(int i=0;i<(l-1)/2;i++)
            {
                Sub=getnum(num,String.valueOf(ind1)+String.valueOf(ind2));
                nums.add(Sub);
                ind1=ind1+2;
                ind2=ind2+2;
            }
        }
        return nums;
    }
    public static List<Integer> findsqrt(int num,int x,int q)
    {
        List<Integer> res=new ArrayList<>();
        int rem=0;
        if(x==0)
        {
            for(int i=0;i<10;i++)
            {
                if(i*i==num)
                {
                    res.add(q+i);
                    res.add(0);
                    break;
                }
                else if(i*i>num)
                {
                    res.add(q+i-1);
                    rem=num-(i-1)*(i-1);
                    res.add(rem);
                    break;
                }
            }
        }
        else
        {
            for(int i=0;i<10;i++)
            {
                if((((x*10)+i)*i)==num)
                {
                    int div=((x/2)*10)+i;
                    res.add(div);
                    res.add(0);
                    break;
                }
                else if(((x*10)+i)*(i)>num)
                {
                    int mul=((x*10)+(i-1))*(i-1);
                    //System.out.println("Multiplicant: "+((x*10)+(i-1))+" Multiplicant: "+mul);
                    res.add((q*10)+(i-1));
                    rem=num-mul;
                    res.add(rem);
                    break;
                }
                    
            }
        }
        System.out.print("Res: ");
        Display(res);
        System.out.println();
        return res;
    }
    public static int mySqrt(int x) 
    {
        if(x==0)
            return 0;
        List<Integer> nums=new ArrayList<>();
        List<Integer> sub=new ArrayList<>();
        int res=0,l;
        l=length(x);
        nums=getarr(x,l);
        Display(nums);
        int X=0,NUM=nums.get(0);
        for(int i=0;i<nums.size();i++)
        {
            if(i==0)
                NUM=nums.get(i);
            else
                NUM=(sub.get(1)*100)+nums.get(i);
            System.out.println("Num: "+NUM+" x: "+X);
            sub=findsqrt(NUM,X,res);
            res=sub.get(0);
            X=sub.get(0)*2;
            System.out.println("Quotient: "+res);
        }
        return res;
    }
    public static void Display(List<Integer> nums)
    {
        for(int i=0;i<nums.size();i++)
        {
            System.out.print(nums.get(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int num,res;
        num=sc.nextInt();
        res=mySqrt(num);
        System.out.println(res);
    }
}
