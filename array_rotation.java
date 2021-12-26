import java.util.*;
public class array_rotation
{
    public static void rotate(int arr[],int n,int d)
    {
        for(int i=0;i<d;i++)
        rotateone(arr,n);
        print(arr,n);
    }
    public static void rotateone(int arr[],int n)
    {int temp;
        temp=arr[0];
      for (int i=0;i<n-1;i++)      
          arr[i]=arr[i+1];
          arr[n-1]=temp;
    }
    public static void print(int arr[],int n)
    {
       for(int i=0;i<n;i++)
        System.out.print(arr[i]+","); System.out.print("}");
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
      System.out.print(arr[i]+",");System.out.println("}");
     System.out.print("The new array is: ");
      System.out.print("{");
    rotate(arr,n,d);
}
}