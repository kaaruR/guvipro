import java.util.*;
public class pro53
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a String");
String s=sc.nextLine();
int count=0;
String sss=s.replaceAll(" ","");
String ss=sss.toLowerCase();
for(char i='a';i<='z';i++)
{
	for(int j=0;j<ss.length();j++)
	{
		if(i==ss.charAt(j))
		{
			count++;
			 ss=ss.replaceAll(String.valueOf(i),"");
		}
	}
}
if(count==26)
{
	System.out.println("pangram");
}
else
{
	System.out.println("not a pangram");
}
}
}
