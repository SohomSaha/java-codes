import java.util.*;
public class binadd
{
    public static void bin(int arr1[],int arr2[])
    {int d=0,a=0;
        for(int i=0;i<arr1.length;i++)
        {
          if(i <arr2.length)
          {
            d=arr1[i]+ arr2[i]+a; a=0;
            arr1[i]=d%2;
            if(d>1)
             a=1;
        }
         else
         {d=(arr1[i]+a);arr1[i]=d%2;a=0;
         if(d>1)
         a=1;}
    }
    if(a==1)
    System.out.print(a);
   for(int i=arr1.length-1;i>=0;i--)
    System.out.print(arr1[i]);
}
public static void main(String args[])
{
    Scanner in=new Scanner(System.in);
    System.out.println("Enter two binary numbers");
    int a=in.nextInt();
    int b=in.nextInt();int d=0,e=0,c=a,f=b;
    while(a>0)
    {a/=10;
        d++;}
     while(b>0)
     {
         b/=10;
         e++;
     }
     int []arr1=new int[d];
     int []arr2=new int[e];
     for(int i=0;i<d;i++)
     {
       arr1[i]=c%10;
       if(f>0)
       arr2[i]=f%10;
       c/=10;f/=10;}
      bin(arr1,arr2) ;
    }
}
       
     
     
    
    

