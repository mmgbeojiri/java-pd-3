class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){

    Car ford = new Car("Ford", "blue", "truck", 1984, 67.0);

    Car konisegg = new Car("Konisegg", "White", "Jesko", 2020, 20000);

    ford.bonus();
    konisegg.bonus();

    print(konisegg.brand);
    print(konisegg.model);
  }


  

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }


}