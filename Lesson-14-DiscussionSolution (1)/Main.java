class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){

    display0To10();
    display10To0();
    xSquare(10);
   
  }

  /*
    Write a function that generates and displays
    integers from 0 to 10.
  */
  void display0To10(){
    for(int i=0; i<=10; i++)
      System.out.print(i+" ");

    System.out.println(":end");
  }
  

  /*
    Write a function that generates and displays
    integers from 10 to 0 backwards
  */
  void display10To0(){
    for(int i=10; i>=0; i--)
      System.out.print(i+" ");

    System.out.println(":end");
  }

  /*
    Write a function that generates and displays
    2^i for i=1-10.

    Then modify code to pass the last i-th terms
  */
  void xSquare(int n){

    for(int i=1; i<=n; i++){
      
      System.out.println(i+" | "+Math.pow(i,2));
    }
    System.out.println(":end");
  }
  
  

}