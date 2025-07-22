public class Junimo {
  private String name;
  private String plantType;
  private String mood;

  public Junimo() {
    // do nothing
  }
  public Junimo(String name, String plantType, String mood) {
    this.name = name;
    this.plantType = plantType;
    this.mood = mood;
  } // close constructor

  public String getName() {
    return this.name;
  } // close getter
  public String getPlantType() {
    return this.plantType;
  } // close getter
  public String getMood() {
    return this.mood;
  } // close getter

  public void setName(String name) {
    this.name = name;
  } // close setter
  public void setPlantType(String plantType) {
    this.plantType = plantType;
  } // close setter
  public void setMood(String mood) {
    this.mood = mood;
  } // close setter

} // close class
