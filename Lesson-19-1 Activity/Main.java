class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  String rollDice() {
    int die = (int) Math.floor(Math.random() * 6) + 1;
    int die2 = (int) Math.floor(Math.random() * 6) + 1;
    return die + " " + die2;
  }

  String lotto() {
    int[] numbers = new int[6]; // six numbers
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = (int) Math.floor(Math.random() * 47 + 1);
    }

    String result = "";
    for (int n : numbers) {
      result += n + " ";
    }

    return result;
  }

  String additionTutor() {
    int a = (int) Math.floor(Math.random() * 11) + 1;
    int b = (int) Math.floor(Math.random() * 11) + 1;

    print("What is " + a + " + " + b + "?");
    String answer = Input.readString();
    if (Integer.parseInt(answer) == a+b) {
      return "Correct!";
    } else {
      return "Incorrect.";
    }

  };

  void init(){

    print(rollDice());
    print(lotto());
    print(additionTutor());
    
  }




}