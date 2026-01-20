class CartItem{
  String itemName;
  double itemPrice;
  int quantity;
  boolean onSale;

  //Create the constructor
 
  CartItem(String itemName, double itemPrice, int quantity, boolean onSale) {
    this.itemName = itemName;
    this.itemPrice = itemPrice;
    this.quantity = quantity;
    this.onSale = onSale;
  }

  double getItemPrice() {
    return this.onSale ? this.itemPrice*0.9 : this.itemPrice;
  }
  
  // write getPrice based on condition detailed in 
  // challenges.txt



}