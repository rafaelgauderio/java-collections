package list;

import java.util.List;
import java.util.Vector;

public class AplicacaoVector {
    public static void main(String [] args) {

        List<String> sports = new Vector<>();

        sports.add("soccer");
        sports.add("handball");
        sports.add("volleyball");
        sports.add("table tennis");
        sports.add("bowling");
        sports.add("rugby");

        System.out.println(sports);

        sports.remove(2);
        sports.remove("bowling");
        System.out.println(sports.get(1));

        for (String nickname: sports) {
            System.out.println("sport name: " +nickname);
        }

    }
}
