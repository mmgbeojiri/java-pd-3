class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    print("It takes " + allowance() + " days to reach $5.");
    addTwoNumbers();
    print(GCF(2, 6));
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