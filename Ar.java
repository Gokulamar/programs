import java.util.*;
class Ar
{
public static void main(String args[])
{
int a[]={1,3,4,1,5,3};
outerloop:
for(int i=0;i<a.length;i++)
{
  int b=a[i];
  for(int j=i+1;j<a.length;j++)
  {
    if(b==a[j])
    {
      System.out.println(a);
      break outerloop;
    }
  }
}
}
}
