import java.util.*;
public class transposearray
{int n,a[][];
    transposearray(int N)
    {n=N;
        a=new int[N][N];
         for(int i=0;i<N;i++)
     {
         for(int j=0;j<N;j++) 
             a[i][j]=(N*i)+j;
     }
    }
   void transpose()  
  { int temp;
     for(int i=0;i<n;i++)
     {
         for(int j=i+1;j<n;j++)
         { temp=a[i][j];
             a[i][j]=a[j][i];a[j][i]=temp;
         }
     }
  }
  void print()
  {
    for(int i=0;i<n;i++)
     {
         for(int j=0;j<n;j++)   
        { System.out.print(a[i][j]+"\t");}
          System.out.println();
     }
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
         transposearray ob=new transposearray(N);
            System.out.println("BEFORE");
               System.out.println("-------------------");
               ob.print();
               ob.transpose();
               System.out.println("AFTER");
               System.out.println("-------------------");
               ob.print();
        }
    }
