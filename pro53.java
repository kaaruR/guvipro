import java.util.*;
public class pro53
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a String");
String s=sc.nextLine();
String sss=s.replaceAll(" ","");
String ss=sss.toLowerCase();
int flag=0,count=0,count1=0;
char c[]=ss.toCharArray();
int arr[]=new int[ss.length()];
for(int i=0;i<c.length;i++)
{
	arr[i]=(int)c[i];
}
Arrays.sort(arr);
for(int j=0;j<arr.length;j++)
{
	for(int k=97;k>=122;k++)
	{
		if(arr[j]==arr[k])
		{
			count=count+1;
		}
		if(count>0)
		{
			count1=count1+1;
		}
	}
}
if(count1==26)
{
System.out.println("yes its a pangram");
}
else
{
	System.out.println("no its not a pangram");
}
}
}
