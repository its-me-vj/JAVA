import java.util.Scanner;
public class  pgm16
{
public static float Area(float r)
{
return(float)(3.14*r*r);
}
public static int Area(int s)
{
return(s*s);
}
public static float Area(float l,float b)
{
return(l*b);
}

public static void main (String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the radius");
float r =sc.nextFloat();
float ar1=Area(r);
System.out.println("Area of circle :"+ar1);
System.out.println("Enter length of Rectangle");
float l =sc.nextFloat();
System.out.println("Enter breadth of Rectangle");
float b =sc.nextFloat();
float ar2=Area(l,b);
System.out.println("Area of Rectangle:"+ar2);
System.out.println("Enter side of square");
int s =sc.nextInt();
int ar3=Area(s);
System.out.println("Area of Square :"+ar3);
}
}
