import java.util.*;
class Rectangle
{ double l,b;
void setData(double a,double c)
{l=a;
b=c; }
void getArea()
{ System.out.println("Area is: "+(l*b));}}
class pgm2
{
public static void main(String args[])
{
  Rectangle ob=new Rectangle();
  ob.setData(12.48,13);
  ob.getArea();
  }}

