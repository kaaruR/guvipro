import java.io.*;
import java.util.Scanner;
public class longestpali
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
StringBuffer rev=new StringBuffer();
String s1=new String();
int count=0,newlen=0;
String max=new String();
char c[]=s.toCharArray();
int l=s.length();
String arr[]=new String[50];
for(int i=0;i<l;i++)
{
for(int j=l-1;j>=0;j--)
{
if(i<j)
{
if(c[i]==c[j])
{
s1=s.substring(i,j+1);
StringBuffer ss1=new StringBuffer(s1);
ss1.reverse();
String strz=new String(ss1);
StringBuffer tt=new StringBuffer(s1);
if(s1.equals(strz))
{
arr[count]=s1;
count++;
}
}
}
}
}
int maxlen=arr[0].length();
for(int k=0;k<count;k++)
{
newlen=arr[k].length();
if(newlen>=maxlen)
{
maxlen=newlen;
max=arr[k];
}
}
System.out.println(max); 
}
}
