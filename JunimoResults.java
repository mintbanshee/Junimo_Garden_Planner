import java.util.Random;

public class JunimoResults {
  private static Random randNum = new Random();

  private static final int MAX_JUNIMOS = 5;
  private static Junimo[] junimos = new Junimo[MAX_JUNIMOS];

  private static String[] names = {"Bumble", "Sprig", "Mossy", 
    "Spark", "Twinkle", "River", "Meadow", "Flutter", "Boop"};
  private static String[] plantTypes = {"Blueberry", "Wheat", 
    "Starfruit", "Cranberry", "Amaranth", "Tulip", "Cauliflower",
    "Ancient Fruit", "Hops"};
  private static String[] moods = {"Cheerful", "Grumpy", "Giggly",
    "Calm", "Sleepy", "Hungry", "Happy", "Playful"};

public static void main(String[] args) {

  for (int i = 0; i < junimos.length; i++) {
    Junimo junimo = new Junimo();
    junimo.setName(names[randNum.nextInt(names.length)]);
    junimo.setPlantType(plantTypes[randNum.nextInt(plantTypes.length)]);
    junimo.setMood(moods[randNum.nextInt(moods.length)]);
    junimos[i] = junimo;
  } // close for

  for(int i = 0; i < junimos.length; i++) {
    System.out.printf("Junimo %d) Your Junimo is: %s - plant type: %s - mood: %s%n",
    i+1,junimos[i].getName(), junimos[i].getPlantType(), junimos[i].getMood());
  } // close for



} // close main

} // close class 
