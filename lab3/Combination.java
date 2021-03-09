import java.util.Scanner;
public class Combination
{
public static void main(String[] args)
{
int n = 3;
Scanner sc = new Scanner(System.in);
int[] arr = new int[n];
System.out.println("enter the numbers");
for(int i=0;i<n;i++)
{
arr[i] = sc.nextInt();
}
System.out.println("combinations are:");
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
for(int k=0;k<n;k++)
{
if(i!=j && j!=k && k!=i)
{
System.out.println(arr[i]+ ""+arr[j]+"" +arr[k]);
}
}
}
}
}
}