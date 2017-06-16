import java.util.Scanner;
public class proqns63
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.next();
        int l=s.length(),max=0,count=0,w=1,flag=0;
        String sub=new String();
        for(int i=0;i<=l;i++)
        {
            for(int j=i+1;j<=l;j++)
            {
                sub=s.substring(i,j);
                if(sub.length()==1)
                {
                    count=0;
                }
                else
                {
                    count=0;
                    for(int k=0;k<l;k++)
                    {
                        for(int n=k+1;n<sub.length();n++)
                        {
                        if(sub.charAt(k)==sub.charAt(n))
                        count=count+1;
                        }
                    }
                }
               if(count<1)
                {
                    int temp=sub.length();
                    if(temp>max)
                    {
                    max=temp;
                    }
                }
                }
            
        
        }
        System.out.println("the max length of non repeating string is "+max);
    }
}
