import java.util.*;
public class pro52
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int x1,y1,x2,y2,x3,y3,x4,y4,dx1,dx2,dy1,dy2;
System.out.println("enter the four co-ordinates as x,y:");
String s1=sc.nextLine();
String ss1[]=s1.split(",");
x1=Integer.parseInt(ss1[0]);
y1=Integer.parseInt(ss1[1]);
String s2=sc.nextLine();
String ss2[]=s2.split(",");
x2=Integer.parseInt(ss2[0]);
y2=Integer.parseInt(ss2[1]);
String s3=sc.nextLine();
String ss3[]=s3.split(",");
x3=Integer.parseInt(ss3[0]);
y3=Integer.parseInt(ss3[1]);
String s4=sc.nextLine();
String ss4[]=s4.split(",");
x4=Integer.parseInt(ss4[0]);
y4=Integer.parseInt(ss4[1]);
dx1=x3-x1;
dy1=y3-y1;
dx2=x4-x2;
dy2=y4-y2;
if(dx1==dx2 && dy1==dy2)
{
	System.out.println("yes its a square");
}
else
{
	System.out.println("no its not a square");
}
}
}
