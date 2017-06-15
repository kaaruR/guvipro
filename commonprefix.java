import java.io.*;
import java.util.*;
public class commonprefix
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the strings split by ',' ");
        String s=sc.nextLine();
        String sar[]=s.split(",");
        int min=sar[0].length();
        int count=0,c=0,len=sar.length,v=1,cc=0,z;
        int len1=len-1;
        int flag=1;
        String mins=new String();
        String sp=new String();
        String n[]=new String[len];
        for(int i=0;i<sar.length;i++)
        {
            int h=sar[i].length();
            if(h<=min)
            {
                
            mins=sar[i];
            min=sar[i].length();
            }
        }
        for(int j=0;j<sar.length;j++)
        {
            if(mins.equals(sar[j]))
            {
                count++;
            }
        }
        if(count==len)
            {
                System.out.println("the common prefix is "+mins);
            }
            else
            {
                while(v<3)
                {
                    sp=sar[0].substring(0,min-v);
                    for(int k=0;k<len;k++)
                    {
                        if(sp.equals(sar[k].substring(0,min-v)))
                        cc++;
                    }
                    if(cc==len)
                    {
                        System.out.println("the common prefix is "+sp);
                        break;
                    }
                  v++;  
                }
            }
            
    }
}
