import java.util.Scanner;
public class pro16
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number of children ");
int size=sc.nextInt();
System.out.println("enter the rating of the children ");
int arr[]=new int[size];
int candiecount=size,increment=0;
for(int i=0;i<size;i++)
{
arr[i]=sc.nextInt();
}
for(int j=0;j<size-1;j++)
{
if(arr[j]<arr[j+1])
{
	increment++;
	candiecount=candiecount+increment;
}
} 
System.out.println("minimum candie required is "+candiecount);
}
}
