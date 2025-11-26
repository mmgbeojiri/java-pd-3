class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    // Challenge1: Read in the file Original.txt and store it in a variable
    String original = Input.readFile("Original.txt");
    print(original);

     print(encode(original));
     print(decode(encode(original)));
    
  }

   // Challenge2: 
  //  Write the function encode that takes in a string
  //  and create a new string that using a caesar cipher 
  // by shifting all ascii values by 3.  Don't worry about
  // wrapping arount the alphabet.

  String encode(String message) {
    String encoded = "";
    for (int i = 0; i < message.length(); i++) {
      encoded += (char) ((int) message.charAt(i) + 3);
    }
    return encoded;
  }


  String decode(String message) {
    String decoded = "";
    for (int i = 0; i < message.length(); i++) {
      decoded += (char) ((int) message.charAt(i) - 3);
    }
    return decoded;
  }


  // Challenge3: 
  //  Write the function decode that takes in a string
  //  and reverses what the function in chanllenge 2
  //  so that you get the original message.

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}