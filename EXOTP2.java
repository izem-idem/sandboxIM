import java.util.Arrays;
import java.util.HashMap;

public class EXOTP2 {

    public static void main(String[] args) {
        String sentenso = "les phrases sont séparés par des saut à la ligne oui mais les phrases se répetent attention bb";
        String[] words= sentenso.split(" ");
        HashMap<String,Integer>  table = new HashMap<>();
        for(String kalima : words){
            if(!table.containsKey(kalima)){
                table.put(kalima , 1);
            }
            else{
                table.put(kalima,table.get(kalima)+1);
            }
        }
        System.out.println(table);
    }
}

