package ClassAndObject;
import java.util.Scanner;
public class persondemo {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		Scanner ob=new Scanner(System.in);
		String name;
		System.out.println("Enter Person Name:");
		name=ob.next();
		System.out.println("Enter age:");
		int age=ob.nextInt();
		System.out.println("Enter gender:");
		String gender=ob.next();
		System.out.println("Enter taxable income:");
		int income =ob.nextInt();
		person person =new person();
		person.setName(name);
		person.setage(age);
		person.setGender(gender);
		person.setIncome(income);
		System.out.println(person);
		Taxcalculation calc=new Taxcalculation();
		calc.calculatetax(person);
		System.out.println("After calculating tax:");
		System.out.println(person);
		ob.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
