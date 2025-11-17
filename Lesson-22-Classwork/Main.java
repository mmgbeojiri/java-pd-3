class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    String[] friends = {"Ashley", "Manuel", "Emily", "Akshit"};
    double[] celsius = {0.0, 67.0, 100.0};

    double[] far = celToFar(celsius);
    for (int i = 0; i < far.length; i++) {
      print(far[i]);
    }

  }

  double[] celToFar(double[] cel ) {
    double[] far = new double[cel.length]; 
    for (int i = 0; i < cel.length; i++) {
      far[i] = celsiusToFarhenheit(cel[i]);
    }

    return far;
  }

  double celsiusToFarhenheit(double c){
        return c*9/5+32;
  }
}