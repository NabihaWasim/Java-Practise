/*Create a Map where the keys are country names (as String)
and the values are their capitals (also String). Populate the
map with at least five countries and their capitals. Write a 
program that prompts the user to enter a country name and then 
displays the corresponding capital, if it exists in the map. */

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Collections;

public class Practise_Map_CityName {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Map<String,String> city=new HashMap<>();
        city.put("India","Delhi");
        city.put("America","Washington DC");
        city.put("Saudi Arabia","Riyadh");
        city.put("Germany","Berlin");
        city.put("Nepal","Kathmandu");
        System.out.println("enter city name:");
        String str=input.nextLine();
        if(city.containsKey(str)){
            System.out.println("Captital:"+city.get(str));
        }
        else{
            System.out.println("City not found");
        }
    }
}
