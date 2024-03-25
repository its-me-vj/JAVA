import java.util.Scanner;
class pgm13
{
public static void main(String[] args)
{
int n,key,i,flag=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the limit:");
n=sc.nextInt();
int []ar=new int[n];
for(i=0;i<n;i++)
{
System.out.println("Enter the number");
ar[i]=sc.nextInt();
}
System.out.println("Enter the number to search");
 key=sc.nextInt();
for(i=0;i<n;i++)
{
if(ar[i]==key)
{
flag=1;
break;
}
}
if(flag==1)

System.out.println(key+"is found");

else
System.out.println(key+"is  not found");
}
}
