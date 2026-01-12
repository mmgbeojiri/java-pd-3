class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    Animal peacock = new Animal("peacock",90,67);
    Animal fatDog = new Animal("dog",1000,67);
    

    System.out.println(peacock.isHealthy());
    System.out.println(fatDog.isHealthy());
  }

  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}