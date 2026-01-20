class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){

    CartItem food = new CartItem("One Baked Bean", 48, 18, true);
    CartItem electronic = new CartItem("iPhone 17", 1000, 18, false);
    CartItem etc = new CartItem("the state of oregon", 89, 18, true);

    if (food.onSale) {print(food.itemName);};
    if (electronic.onSale) {print(electronic.itemName);};
    if (etc.onSale) {print(etc.itemName);};



    double subtotal = 0;
    subtotal += food.getItemPrice();
    subtotal += electronic.getItemPrice();
    subtotal += etc.getItemPrice();

    subtotal *= 1.08675;
    print("Total: " + subtotal);
    
  }


  

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }


}