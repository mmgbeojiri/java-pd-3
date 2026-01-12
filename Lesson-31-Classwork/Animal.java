class Animal{

  String animalSpecies;
  double weight;
  double height;

  
  Animal(String animalSpecies, double weight, double height){
    this.animalSpecies  = animalSpecies;
    this.weight         = weight;
    this.height         = height;
  }

  boolean isHealthy() {
    if (30 < this.weight && this.weight < 100 ) {
      return true;
    }
    return false;
  }

  double convertPoundsToKilo() {
    return this.weight / 2.205;
  }
 

  // other class functions
  
  
  
}