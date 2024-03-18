import java.util.Scanner;
class pgm11{
public static void main(String[] args)
{
int n,i,j;
System.out.println("Enter the  no of strings:");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
String[] str=new String[n];
for(i=0;i<n;i++)
{
System.out.println("Enter String #"+(i+1));
str[i]=sc.next();
}
for(i=0;i<n-1;i++)
{
for(j=0;j<n-i-1;j++)
{
if(str[j].compareTo(str[j+1])>0)
{
String temp=str[j];
str[j]=str[j+1];
str[j+1]=temp;
}
}
}
System.out.println("Sorted String");
for(String str1 : str)
{
System.out.println(str1+"   ");
}
}}
