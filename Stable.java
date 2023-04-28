//Create the Stable class here.
import java.util.ArrayList;


public class Stable {
    private String address;
    private ArrayList<Horse> horses;

    public Stable(String address) {
        this.address = address;
        this.horses = new ArrayList<Horse>();
    }

    public void addHorse(Horse horse) {
        horses.add(horse);
    }

    public void printHorses() {
        int i = 1;
        for (Horse horse : horses) {
            System.out.println("Horse #" + i + " Name: " + horse.getName() + " Weight: " + horse.getWeight() + " Tame: " + horse.isTame());
            i++;
        }
    }
}