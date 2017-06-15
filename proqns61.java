import java.util.Scanner;
public class proqns61
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two strings:");
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String s1l=s1.toLowerCase();
        String s2l=s2.toLowerCase();
        char c1[]=new char[4];
        char c2[]=new char[4];
        for(int i=0;i<s1l.length();i++)
        {
            int ss=(int)s1l.charAt(i);
            int ssa=ss+10;
            if(ssa>122)
            {
                int temp=122-ss;
                int no1=10-temp;
                int r1=96+no1;
                ssa=r1;
            }
            c1[i]=(char)ssa;
        }
            String result1=new String(c1);
        for(int j=0;j<s2l.length();j++)
        {
            if(j==0 || j==3)
            {
                c2[j]=s2l.charAt(j);
            }
            else 
            {
                int ss1=(int)s2l.charAt(j);
                int ssa2=ss1+10;
                if(ssa2>122)
                {
                    int temp1=122-ss1;
                    int no2=10-temp1;
                    int r2=96+no2;
                    ssa2=r2;
                }
                c2[j]=(char)ssa2;
            }
        }
        String result2=new String(c2);
        System.out.println(result1+" "+result2);
    }
}



