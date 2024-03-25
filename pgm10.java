import java.util.Scanner;
class pgm10
{
public static void main(String args[])
{
int n,i,total=0,max;

double per;
System.out.println("Enter the no of subject:");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int []m=new int[n];
max=n*100;
for(i=0;i<n;i++)
{
System.out.println("Enter the mark out of 100:");
m[i]=sc.nextInt();
total+=m[i];
}
per = ((double) total / max) * 100;
System.out.println("max marks:"+max);

System.out.println("Total marks:"+total);
System.out.println("Percentage:"+per);
}
}
