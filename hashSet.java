import java.util.HashSet;
import java.util.Iterator;

public class hashSet {
    public static void main(String args[]){
        HashSet<String> h = new HashSet<String>();
        h.add("Mukul");
        h.add("Phougat");
        h.add("SDE1");
        System.out.println(h);
        System.out.println(h.contains("SDE1"));
        Iterator<String> i = h.iterator();
        /* while(i.hasNext()){                     for traversing through hashset
            System.out.print(i.hasNext()+" ");
        } */

        System.out.println(h.size());
        h.remove("Phougat");
        System.out.println(h.size());
        for(String s: h){
            System.out.print(s+" ");
        }
        System.out.println(h.isEmpty());
        h.clear();
        System.out.println(h.size());
    }
}
