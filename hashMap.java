import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class hashMap {
    public static void main(String args[]){
        HashMap<String, Integer> Friends = new HashMap<String, Integer>();
        Friends.put("Mukul",21);
        Friends.put("Hannah",24);
        Friends.put("World",00);
        System.out.println(Friends);
        System.out.println(Friends.size());
        for(Map.Entry<String ,Integer> e: Friends.entrySet()){
            System.out.print(e.getKey()+" "+e.getValue());
            System.out.println();
        }
        if(Friends.containsValue(0))
            System.out.print("Yes");

        else
            System.out.print("No");
        System.out.println();
        Friends.remove("World");
        System.out.println(Friends);
        System.out.println(Friends.size());

        System.out.println(Friends.get("Hannah"));
        System.out.println(Friends.get("World"));
    }
}
