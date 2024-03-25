import java.util.Scanner;
class pgm13
{
public static void main(String[] args)
{
int n,key,i,flag=0,pos=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the limit:");
n=sc.nextInt();
int []ar=new int[n];
System.out.println("Enter the numbers");
for(i=0;i<n;i++)
{

ar[i]=sc.nextInt();
}
System.out.println("Enter the number to search");
 key=sc.nextInt();
for(i=0;i<n;i++)
{
if(ar[i]==key)
{
flag=1;
pos=i+1;
System.out.println(key+"is found at"+pos);
}
}
if(flag==0)
System.out.println(key+"is  not found");
}
}
