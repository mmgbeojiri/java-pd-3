
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}
	double gpa(double inputGPA) {
		if (inputGPA > 90) {
			return inputGPA *1.1;
		} else {
			return inputGPA;
		}
	}

	boolean isGraduating(int grade, int credits) {
		if (grade >= 12 && credits >= 44) {
			return true;
		} else {
			return false;
		}
	}

	String BMI(double weight, double inches) {
		double bmi = (weight / Math.pow(inches, 2)) * 703;
		if (bmi < 18.5) {
			return "Underweight";
		} else if (bmi >= 18.5 && bmi <= 24.9) {
			return "Normal";
		} else if (bmi >= 25 && bmi <= 39.9) {
			return "Overweight";
		} else if (bmi >= 40) {
			return "Obese";
		}
		// default
		return "Enter valid weight and height";
	}

	boolean blueOrViolet(double tHz) {
		if (tHz >= 600 && tHz <= 670) {
			return true;
		} else if (tHz >= 700 && tHz >= 750) {
			return true;
		} else {
			return false;
		}
	}
	void init(){

   System.out.println(gpa(90.67));
   System.out.println(isGraduating(11, 52));
   System.out.println(BMI(230, 69));
   System.out.println(blueOrViolet(670));

  }

 
  
}