import java.util.Scanner;
public class Square
{
public static void main(String[] args)
{
int sum =0;
System.out.println("enter size of array");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] arr = new int[10];
System.out.println("enter no. of element");
for(int i=0;i<n;i++)
{
arr[i]= sc.nextInt();
}
for(int i=0;i<n;i++)
{
int sq = arr[i] * arr[i];
sum = sum + sq;
}
System.out.println("sum of squares = "+sum);
}
}