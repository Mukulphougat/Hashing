import java.util.Hashtable;

public class ImplementingHashing {
    public static void main(String args[]){
        Hashtable<Integer, String> friends = new Hashtable<Integer, String>();     //  Using Hashtable
        friends.put(1,"Harry");
        friends.put(2,"Harmoine");
        friends.put(3,"Clay");
        friends.put(4,"Hannah");
        System.out.println(friends.get(4));
    }
}
