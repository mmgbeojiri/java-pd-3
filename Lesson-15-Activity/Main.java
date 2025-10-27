class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}
  String spaces(int n) {
    return " ".repeat(n) + "DONE"; // in python you could just multiply the string by 5
  }
  double harmonic(int n) {
    double sigma = 0.0;
    for (int i = 0; i < n; i++) {
      sigma += 1.0 / (i+1);
    }
    return sigma;
  }

  double factorial(int n) {
    if (n == 0 || n == 1) {
      return 1.0;
    }
    return n* factorial(n - 1);
  }

  double sine(int iteration, double rad) {
    double sigma = 0.0;
    for (int i = 1; i <= iteration; i++) {
      double term = Math.pow(rad, 2*i - 1) / factorial(iteration*2 - 1);
      if (i % 2 == 1) {
        sigma += term;
      } else {
        sigma -= term;
      }
    }
    return sigma;
  }

  void fib(int n) {
    int a = 0;
    int b = 1;
    for (int i = 0; i < n; i++) {
      print(a + " ");
      b += a;
      a = b - a;

    }
  }

  void mTable() {
    for (int i = 1; i <= 10; i++) {
      for (int j = 1; j <= 10; j++) {
        System.out.print(i*j + "\t");
      }
      System.out.println();
    }
  }
  void init(){
    print(spaces(5));
    print(harmonic(5));
    print(factorial(5));
    print(sine(5, Math.PI / 2)); // should return 0
    fib(6);
    mTable();
  }


  
}