public class PsychicWeirdo{

  private String name;
  private Cyclops[] school;

  public PsychicWeirdo(String name){
    this.name = name;
    this.school = new Cyclops[500];
  }
  
  public String getName(){
    return this.name;  
  }

  public int schoolHeadCount(){
    int count = 0;
    for(Cyclops cyclops : school){
      if (cyclops != null){
        count++;
      }
    }
    return count;
  }

  public boolean schoolAtCapacity(){
    return schoolHeadCount() == school.length;
  }

  public void adopt(Cyclops cyclops){
    if (schoolAtCapacity()){
      return;
    }
    int index = this.schoolHeadCount();
    school[index] = cyclops;
  }

}