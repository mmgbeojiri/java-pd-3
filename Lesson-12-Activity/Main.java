class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  String creditCardType(String card) {
    if (card.startsWith("4")) {
      // its the same as in python with startsWith
      return "Visa";
    }
    if (card.startsWith("51") || card.startsWith("55")) {
      return "Mastercard";
    }
    if (card.startsWith("34") || card.startsWith("37")) {
      return "American Express";
    }
    if (card.startsWith("36")) {
      return "Diners Club";
    }
    if (card.startsWith("6011") || card.startsWith("65")) {
      return "Discover";
    }
    return "Enter Valid Card";
  }

  String pigLat(String word) {
    String output = word.substring(1) + word.charAt(0) + "ay";
    return output;
  }

  String nycLocate(String zip) {
    if (zip.startsWith("100") || zip.startsWith("101") || zip.startsWith("102")) {
      return "Manhattan";
    }
    if (zip.startsWith("103")) {
      return "Staten Island";
    }
    if (zip.startsWith("104")) {
      return "Bronx";
    }
    if (zip.startsWith("112")) {
      return "Brooklyn";
    }
    if (zip.startsWith("111") || zip.startsWith("113") || zip.startsWith("114")) {
      return "Queens";
    }
    return "Enter Valid Zip";
  }

  String getMonth(String date) {
    String[] months = {
      "January", "February", "March", "April", "May", "June",
      "July", "August", "September", "October", "November", "December"
    };
    return months[Integer.parseInt(date.substring(0,2)) -1];
  }

  boolean validatePassword(String pass) {
    int letters = 0;
    int digits = 0;
    int special =0;

    for (int i = 0; i < pass.length(); i++) {
      char c = pass.charAt(i);
      // similar to isalpha() isdigit() in python
      if (Character.isLetter(c)) {
        letters += 1;
        continue;
      }
      if (Character.isDigit(c)) {
        digits += 1;
        continue;
      }
      if (c != '^' && c != '*' && c != ',') {
        special += 1;
      }

    }

    int sum = letters + digits + special;
    return (5 <= sum && sum <= 8);
  }
  void init(){ 
    print(creditCardType("6793"));
    print(creditCardType("4002"));
    print(pigLat("nix"));
    print(nycLocate("10001"));
    print(getMonth("05/25/2024"));
    print(validatePassword("236750fd3"));
    print(validatePassword("2367@0fd"));
   
  }

  
  
}