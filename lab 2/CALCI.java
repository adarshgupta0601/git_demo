public class CALCI
{
public static void main(String args[])
{
int a = Integer.parseInt(args[0]);
String operation = args[1];
int b = Integer.parseInt(args[2]);
int c;

if (operation.equals("+"))
{
c=a+b;
}
else if (operation.equals("-"))
{
c=a-b;
}
else if (operation.equals("*"))
{
c=a*b;
}
else if (operation.equals("/"))
{
c=a/b;
}
else
{
throw new java.lang.Error("operator not exist");
}
System.out.println(c);
}
}