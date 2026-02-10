/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.techwebdocs.integertoroman;

/**
 *
 * @author mohar
 */
import java.util.*;
import java.io.*;
public class IntegertoRoman 
{
    public static String GetSymbol(int digit)
    {
        String sym="";
        if(digit==1)
            sym="I";
        else if(digit==5)
            sym="V";
        else if(digit==10)
            sym="X";
        else if(digit==50)
            sym="L";
        else if(digit==100)
            sym="C";
        else if(digit==500)
            sym="D";
        else if(digit==1000)
            sym="M";
        else if(digit==0)
            sym="";
        return sym;
    }
    public static int present(int digit)
    {
        int[] arr=new int[8];
        arr[0]=1;
        arr[1]=5;
        arr[2]=10;
        arr[3]=50;
        arr[4]=100;
        arr[5]=500;
        arr[6]=1000;
        arr[7]=0;
        int match=0;
        for(int i=0;i<8;i++)
        {
            if(digit==arr[i])
            {
                match=1;
            }
        }
        return match;
    }
    public static String Symbol(int digit,int length)
    {
        String sym="",bit="";
        int match,submatch;
        match=present(digit);
        if(match==0)
        {
            submatch=present(digit+length);//for IV  IX
            
            if(submatch==1)
            {
                bit=GetSymbol(length);
                sym=sym+bit;
                bit=GetSymbol(digit+length);
                sym=sym+bit;
                return sym;
            }
            // now for III
            int temp=digit,temp2=length;
            if(digit>(length*5) && length<1000)//digit=70, length=10
            {
                temp=(digit-(length*5))/length;//temp=2
                bit=GetSymbol(length*5);//50
                sym=sym+bit;//L
                bit=GetSymbol(length);//10
                while(temp>0)
                {
                    sym=sym+bit;
                    temp=temp-1;
                }
                return sym;
            }
            else
            {
                temp=digit;
                bit=GetSymbol(length);
                while(temp>0)
                {
                    sym=sym+bit;
                    temp=temp-length;
                }
                return sym;
            }
            
        }
        else
            sym=GetSymbol(digit);
        return sym;
    }
    public static String intToRoman(int num)
    {
        String Roman="",symbol;
        int Num=num;
        int m,ind=1;
        while(Num>0)
        {
            m=(Num%10)*ind;
            symbol=Symbol(m,ind);
            Roman=symbol+Roman;
            Num=Num/10;
            ind=ind*10;
         
        }
        
        return Roman;
    }
    public static void main(String[] args) 
    {
        int num;
        String roman;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        roman=intToRoman(num);
        System.out.println("Roman numeral: "+roman);
    }
}
