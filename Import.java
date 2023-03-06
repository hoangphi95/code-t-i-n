package dictionnary;

import java.util.Map;
import java.util.TreeMap;

public class Import {
    private Map<String,String> daTa = new TreeMap<>();
     public Import(){

     }
     public String Content(String keyWord, String meaning){
         return this.daTa.put(keyWord,meaning);
     }
     public String WordLookup(String keyWord){
         return this.daTa.get(keyWord);
     }
}
