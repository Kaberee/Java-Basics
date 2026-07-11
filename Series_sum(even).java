import java.util.Scanner;
public class Series{
    public static void main(String[] args) {
     for(int i=2; i<=20; i+=2)
     {
         System.out.println(i+" ");
     }
     int j=2;
     while(j<=20)
     {
     System.out.println(j+ " ");
    j+=2;
     }
     int k=2;
     do {
        System.out.println(k);
        k+=2;
     }while(k<=20);
     int sum=0;
     for(int i=2; i<=20; i+=2)
     {
         sum=sum+i;
     }
     System.out.println(sum);
    }
}
