import java.util.Scanner;

public class array_rotation_juggling_algorithm
{
    public static int gcd (int n,int d)
    {
        if(d==0)
        return n;
        else
        return gcd(d,n%d);
    }
    public static void rotate(int arr[],int n,int d)
    {int k=0,j;
        for(int i=0;i<gcd(n,d);i++)
       {
           int temp=arr[i];
           j=i;
            while(true)
            {
              k=j+d;
              if(k>=n)
              k-=n;
              if(k==i)
              break;
              arr[j]=arr[k];
              j=k;
            }
            arr[j]=temp;
        }
       for(int i=0;i<n;i++) 
       System.out.print(arr[i]+" ");
       System.out.println("}");
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=in.nextInt();
        System.out.println("Enter number of rotating elements");
        int d=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
      arr[i]=in.nextInt();System.out.print("{");
      for(int i=0;i<n;i++)
      System.out.print(arr[i]+" ");System.out.println("}");
     System.out.print("The new array is: ");
      System.out.print("{");
    rotate(arr,n,d);
    }
}