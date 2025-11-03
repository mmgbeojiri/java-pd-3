import Math;

class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}
  String addNums() {
    int num1 = (int) (Math.random() * (50 - -5)) - 5;
    int num2 = (int) (Math.random() * (50 - -5)) - 5;
    return num1 + " + " + num2 + " = " + (num1 + num2);
  };

  int generatePin() {
    int a1 = (int) (Math.random() * (8 - 3)) + 2;
    int a2 = (int) (Math.random() * (8 - 3)) + 2;
    int a3 = (int) (Math.random() * (8 - 3)) + 2;
    int a4 = (int) (Math.random() * (8 - 3)) + 2;
    return a1 * 1000 + a2 * 100 + a3 * 10 + a4;
  };
  void init(){
    print(addNums());
    print(generatePin());
  }

  
}