import java.util.Scanner;
import java.util.Arrays;
public class proqns2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        String num=sc.next();
        System.out.println("Enter the number of digits the output should contain ");
        int digi=sc.nextInt();
        char c[]=num.toCharArray();
        char sar[]=new char[digi];
        Arrays.sort(c);
        for(int i=0;i<digi;i++)
        {
        sar[i]=c[i];
        }
        String s=new String(sar);
        System.out.println("the least number after deleting "+digi+" digits is "+s);
    }
}
