package DataStructure;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class UseOfMap {
    public static void main(String[] args) {
        Map<String, String> cityNcountry = new LinkedHashMap<String, String>();
        cityNcountry.put("USA", "new york");
        cityNcountry.put("Uk", "London");
        cityNcountry.put("Canada", "Montreal");

        for(Map.Entry<String, String> state:cityNcountry.entrySet()){
            System.out.println(state.getKey() + "--->" + state.getValue());
        }

    }
}
