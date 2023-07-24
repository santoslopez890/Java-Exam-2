package rocks.zipcode.assessment2.collections;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Use a map to solve
 */
public class MonthConversion {
    private HashMap<Integer,String> hashMap=new HashMap<>();




    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */

    public void add(Integer monthNumber, String monthName) {
        hashMap.put(monthNumber,monthName);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {

        return hashMap.get(monthNumber);
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public int getNumber(String monthName) {
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            if (Objects.equals(monthName, entry.getValue())) {
                return entry.getKey();
            }
        }
        return 0;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        if((monthNumber > 0 && monthNumber <= 12)&&(hashMap.get(monthNumber)!=null)){
            return true;
        }
        return false;
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        String [] months=new String []{"January", "February","March","April","May","June","July","August","September","October","November","December"};
        for (int i = 0; i < months.length; i++) {
            if(months[i].equals(monthName)){
                return true;
            }
        }
        return false;
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return hashMap.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        hashMap.put(monthNumber,monthName);
    }
}
