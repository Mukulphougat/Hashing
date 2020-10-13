import com.sun.corba.se.spi.orbutil.fsm.Input;
import com.sun.xml.internal.stream.StaxErrorReporter;

import java.util.ArrayList;
import java.util.LinkedList;

public class ImplementinChaining {
    public static void main(String args[]){
        myHash mh = new myHash(7);
        mh.Insert(10);
        mh.Insert(20);
        mh.Insert(15);
        mh.Insert(7);
        System.out.println(mh.Search(10));
        mh.Delete(15);
        System.out.println(mh.Search(15));
    }
}
class myHash{
    int bucket;
    ArrayList<LinkedList<Integer>> table;
    myHash(int b)
    {
        bucket = b ;
        table = new ArrayList<LinkedList<Integer>>();
        for( int i = 0 ; i < b ; i++ )
            table.add(new LinkedList<Integer>());
    }

    void Insert(Integer A)
    {
        int i = A % bucket;
        table.get(i).add(A);
    }

    boolean Search(Integer B)
    {
        int i = B % bucket ;
        return table.get(i).contains(B);
    }

    void Delete(Integer C)
    {
        int i = C % bucket ;
        table.get(i).remove(C);
    }
}