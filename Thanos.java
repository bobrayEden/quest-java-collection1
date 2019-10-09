import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
    ArrayList<Hero> thanosList = new ArrayList<>();
    Hero widow = new Hero("Black Widow", 34);
    Hero captain = new Hero("Captain America", 100);
    Hero vision = new Hero("Vision", 3);
    Hero iron = new Hero("Iron Man", 48);
    Hero scarlet = new Hero("Scarlet Witch", 29);
    Hero thor = new Hero("Thor", 1500);
    Hero spider = new Hero("Spider-Man", 18);
    Hero hulk = new Hero("Hulk", 49);
    Hero doctor = new Hero("Doctor Strange", 42);

        // TODO 2 : Add those heroes to the list
        // name: Black Widow, age: 34
        // name: Captain America, age: 100
        // name: Vision, age: 3
        // name: Iron Man, age: 48
        // name: Scarlet Witch, age: 29
        // name: Thor, age: 1500
        // name: Spider-Man, age: 18
        // name: Hulk, age: 49
        // name: Doctor Strange, age: 42
    thanosList.add(widow);
    thanosList.add(captain);
    thanosList.add(vision);
    thanosList.add(iron);
    thanosList.add(scarlet);
    thanosList.add(thor);
    thanosList.add(spider);
    thanosList.add(hulk);
    thanosList.add(doctor);

        // TODO 3 : It's Thor birthday, now he's 1501
    thor.setAge(1501);

        // TODO 4 : Shuffle the heroes list
    Collections.shuffle(thanosList);

        // TODO 5 : Keep only the half of the list
    // avec sublist
    List<Hero> thanosList2 = thanosList.subList(0, 4);

    // avec loop for
    /* for (int i = 0; i < thanosList.size() / 2; i++) {
        thanosList.remove(i);
    } */

        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        for (Hero i: thanosList2
             ) {
            System.out.println(i.getName());
        }

    }
}