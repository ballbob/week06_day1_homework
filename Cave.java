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

  public int headCount(){
    int count = 0;
    for (Cyclops cyclops : population) {
      if (cyclops != null) {
        count++;
      }
    }
    return count;
  }

  public void welcome(Cyclops cyclops){
    int index = this.headCount();
    population[index] = cyclops;
  }

}