class MyExcp extends Exception
{
private static int accno[]={1001,1002,1003};
private static String name[]={"Raj","Ram","Sai"};
private static double bal[]={25000.00,15000.00,45000.00};
MyExcp()
{}
MyExcp(String str)
{
super(str);
}
public static void main(String args[])
{
try
{
System.out.println("Accno : "+"\t"+"Nam"+"\t"+"Balance");
for(int i=0;i<3;i++)
{
System.out.println(accno[i]+"\t\t"+name[i]+"\t"+bal[i]);
if (bal[i]<20000)
{
MyExcp me = new MyExcp("Balance amount is less");
throw me;
}}}
catch(Exception me)
{
me.printStackTrace();
}}}
