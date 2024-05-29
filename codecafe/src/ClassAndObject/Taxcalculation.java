package ClassAndObject;

public class Taxcalculation {

	public void calculatetax(ClassAndObject.person person) {
		// TODO Auto-generated method stub
		if(person.getage() > 65 || person.getGender().equalsIgnoreCase("female")) {
			person.settax(0);
			System.out.println("Tax not applicable");
		} else {
			if (person.getIncome() <= 160000) {
				person.settax(0);
			} else if (person.getIncome() > 160000 && person.getIncome() <= 500000) {
				person.settax((person.getIncome()-160000)*10/100);
			} else if (person.getIncome() > 500000 && person.getIncome() <= 800000) {
				person.settax((person.getIncome()-500000)*20/100+34000 );
			}	else {
				person.settax((person.getIncome()-800000)*30/100+94000);
					
				}
			}
		}
	}


