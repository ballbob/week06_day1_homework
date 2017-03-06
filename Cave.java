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

  public boolean isAtCapacity(){
    return headCount() == population.length;
  }

  public void welcome(Cyclops cyclops){
    if (isAtCapacity()){
      return; 
    }
    int index = this.headCount();
    population[index] = cyclops;
  }

  public void evacuate(){
    for (int i=0; i< population.length; i++)
      population[i] = null;
  }

  public void exit(Cyclops cyclops){
    int index = headCount();
    population[index] = null;
  }

}