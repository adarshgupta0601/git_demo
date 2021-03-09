import java.util.Scanner;
public class Divisiblefive
{
public static void main(String[] args)
{
int sum=0;
for(int i=41;i<250;i++)
{
if(i%5 == 0)
{
sum = sum + i;
}
}
System.out.println("sum of no divisible by 5 =" +sum);
}
}