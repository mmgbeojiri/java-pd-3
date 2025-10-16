class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  String getUsername(String user) {
    return user.split("@")[0];
    // return user.substring(0, user.indexOf('@'));
  }

  String splitReverse(String string) {
    String newString = string.substring(string.length()/2);
    newString = newString + string.substring(0, string.length()/2);
    return newString;
  }

  String createUsername(String fname, String sname, String osis) {
    return fname.charAt(0)+sname+osis.substring(5);
  }

  void init(){
    print(getUsername("johndoe@example.com"));
    print(splitReverse("Happy Days"));
    print(createUsername("John", "Doe", "123456789"));
  }

    
  }

  
  