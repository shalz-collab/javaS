import java.util.*;
class SII
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
double age,p,time,interest,rate,si;
System.out.println("Enter principal amount:");
p=sc.nextDouble();
System.out.println("Enter time period:");
time=sc.nextDouble();
System.out.println("Enter age:");
age=sc.nextDouble();
if(age>=60){
rate=12;
System.out.println("Customer is a Senior Citizen.");
}
else{
rate=10;
System.out.println("Customer is not a Senior Citizen.");
}
si=(p*rate*time)/100;
System.out.println("Simple Interest:"+si);
}
}

