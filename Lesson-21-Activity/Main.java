class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    menu();
  }

  void addTwoNumbers() {
    int randInt1 = 0;
    int randInt2 = 0;
    int userAnswer = 100; //initialize to a value that won't equal the sum
    while ((randInt1 + randInt2) != userAnswer) {
      randInt1 = randInt(1, 10);
      randInt2 = randInt(1, 10);

      print(randInt1 + " + " + randInt2 + " = ?");
      userAnswer = Input.readInt();
      if (userAnswer == randInt1 + randInt2) {
        print("Correct!");
      } else {
        print("Incorrect. The answer is " + (randInt1 + randInt2));
      }
    }
}

int GCF(int a, int b) {
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
}

void menu(){
  print("Welcome Looney Tune's System");
  boolean exit = false;
  while (!exit) {
    print("Select from the following choices:");
    print("1 - Allowance");
    print("2 - Addition game");
    print("3 - Calculate the GCF of two integers");
    print("4 - Exit Looney Tune System");

    int choice = Input.readInt();

    switch (choice) {
      case 1:
        allowance();
        break;
      case 2:
        addTwoNumbers();
        break;
      case 3:
        print("Enter first integer:");
        int num1 = Input.readInt();
        print("Enter second integer:");
        int num2 = Input.readInt();
        print("The GCF of " + num1 + " and " + num2 + " is " + GCF(num1, num2));
        break;
        case 4:
          print("Exiting Looney Tune System. Goodbye!");
          exit = true;
          break;
    }
  }
}

  double allowance() {
    double initial = 0.01;
    int count = 1;
    while (initial < 5) {
      initial *= 2;
      count++;
    }
    return count;
  }
  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}