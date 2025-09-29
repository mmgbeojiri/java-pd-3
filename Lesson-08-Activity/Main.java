class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void print(String input) {
		System.out.println(input);
	}

	void print(double input) { // overloading
		System.out.println(input); 
	}

	double FtoC(double f) {
		return (f - 32) * 5/9;
	}

	double sphereVolume(double r) {
		return( 4.0/3.0) * Math.PI * Math.pow(r, 3);
	}

	double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}

  void init(){
	print("Hello, World!");

	print(FtoC(32));
	print(sphereVolume(5));

	print(distance(5, 6, 5, 10));
  }

  
 
}