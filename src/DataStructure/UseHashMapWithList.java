package DataStructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseHashMapWithList {
    public static void main(String[] args) {
        List<String> cityOfUSA = new ArrayList<String>();
        cityOfUSA.add("New York");
        cityOfUSA.add("Orlando");
        cityOfUSA.add("Atlanta");

        List<String> cityOfUK = new ArrayList<String>();
        cityOfUK.add("London");
        cityOfUK.add("Manchester");
        cityOfUK.add("Birmingham");

        List<String> cityOfNepal = new ArrayList<String>();
        cityOfNepal.add("Kathmandu");
        cityOfNepal.add("Biratnagar");
        cityOfNepal.add("Pokhara");

        Map<String, List<String>> listOfCountryNCity = new HashMap<String, List<String>>();
        listOfCountryNCity.put("USA", cityOfUSA);
        listOfCountryNCity.put("UK", cityOfUK);
        listOfCountryNCity.put("Nepal", cityOfNepal);

        for(Map.Entry<String, List<String>> state:listOfCountryNCity.entrySet()){

                System.out.println(state.getKey() + " has these cities " + state.getValue());
        }
    }
}
