import java.util.Scanner;
public class Calculator 
{
public static void main(String args[])
{

	Scanner sc=new Scanner(System.in);

	System.out.println("enter value 1");

	int a=sc.nextInt();

	System.out.println("enter value 2");

	int b=sc.nextInt();

	System.out.println("1->addition\n2->substraction\n3->multiplication\n4->division");

	int s=sc.nextInt();

	if(s==1)

	{

		System.out.println(a+b);

	}

	else if(s==2)

	{

		System.out.println(a-b);

	}

	else if(s==3)

	{

		System.out.println(a*b);

	}

	else if(s==4)

	{

		System.out.println(a/b);

	}

	sc.close();

	}

}
