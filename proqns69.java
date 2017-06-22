import java.util.*;
public class proqns69
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String str = s.replaceAll("\\D+","");
int n=Integer.parseInt(str);
int arr[]=new int[str.length()]; 
int max=0,mul1=1,mul2=0,var1=11,var2=11,sum=0,sum1=0,sum2=0,number,sqrt;
for(int i=0;i<str.length();i++)
{
	char cc=str.charAt(i);
	int m=Character.getNumericValue(cc);
	arr[i]=m;
	if(m>max)
	{
		max=m;
	}
}
int min=max;
for(int j=0;j<arr.length;j++)
{
		mul1=max*arr[j];
}
while(var1>=10)
{
	var1=0;
	int no1=mul1;
	while(no1>0)
	{
		int q1=no1%10;
		no1=no1/10;
		sum1=sum1+q1;
	}
	var1=sum1;
	no1=sum1;
}
for(int k=0;k<arr.length;k++)
{
	if(arr[k]<min)
		min=arr[k];
}
for(int l=0;l<arr.length;l++)
{
	sum=min+arr[l];
	mul2=mul2*sum;
}
while(var2>=10)
{
	var2=0;
	int no2=mul2;
	while(no2>0)
	{
		int q2=no2%10;
		no2=no2/10;
		sum2=sum2+q2;
	}
	var2=sum2;
	no2=sum2;
}
if(sum1>sum2)
{
	number=sum1;
}
else
	number=sum2;
sqrt=number*number;
System.out.println(sqrt);
}
}
