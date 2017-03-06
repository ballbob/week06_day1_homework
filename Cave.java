public class Cave {

  private String name;
  private Cyclops[] population;

  public Cave(String name){
    this.name = name;
    this.population = new Cyclops[10];
  } 

  public String caveName(){
    return this.name;
  }

}