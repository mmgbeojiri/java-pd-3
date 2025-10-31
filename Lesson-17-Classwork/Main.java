class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  String swapLetter(String s, char find, char replace){
    String build = "";
    for (int i = 0; i < s.length(); i++) {
      char currentChar = s.charAt(i);
      if (currentChar == find) {
        build += replace;
      } else {
        build += currentChar;
      }
    }
    return build;
  }

  String encryption2(String s){
    String first = s.substring(0, (int) Math.floor(s.length()/2));
    String second = s.substring((int) Math.floor(s.length()/2));
    String result = "";
    for (int i = 0; i < first.length(); i++) {
      result += first.charAt(i);
      result += second.charAt(i);
    }

    if(second.length() > first.length()){ // if the second half is greater than the first half (ex string 1 is 4 string 2 is 5)
      result += second.charAt(second.length() - 1);
    }
    return result;
  }

  String encryption3(String s) {
    String result = "";
    for (int i = 0; i < s.length()/2; i++) {
      
      result += s.charAt(i);
        
      
      result += s.charAt(s.length() - 1 - i);
    }
    return result;
  }

  void init(){

    print(swapLetter("Six Seven", 'S', 'P'));
    print(encryption2("Six Seven"));
    print(encryption2("abcdefghi"));
    print(encryption3("abcdef"));
  }

  //will use reverse for problem 3
  String reverse(String s){
    String bld="";
    for(int x=s.length()-1; x>=0; x--)
      bld+=s.substring(x,x+1);

    return bld;
  }


}