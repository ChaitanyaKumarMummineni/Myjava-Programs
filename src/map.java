import java.util.*;
public class map {
    public static void main(String[] args) {
        // Creation of Map
        Map<Integer,String> m=new Hashtable<Integer,String>();

        // Addition of elements into the map.
        m.put(101,"chaitu");
        m.put(102,"vinod");
        m.put(205,"amma");
        System.out.println(m);
        System.out.println();

        // Retrieval of keys from the map.
        Set<Integer> keys=m.keySet();
        for (Integer key: keys) {
            System.out.println(key);
        }
        System.out.println();

        // Retrieval of values from the map.
        Collection<String> value=m.values();
        for (String val:value) {
            System.out.println(val);
        }
        System.out.println();

        //Retrieval of value based on key.
        System.out.println(m.get(102));
        System.out.println();

        //Retrieval of key value for information
        for (Integer key:keys) {
            System.out.println(key+"-->"+m.get(key));
        }
        System.out.println();


        // Deletion of Elements from the map.
        m.remove(205);
        System.out.println(m);
        System.out.println();

        //Verification of key in a map.
        System.out.println("verification of key chaitu: "+m.containsKey(101));
        System.out.println("verification of key amma: "+m.containsKey(205));
        System.out.println();

        //Verification of value in a map.
        System.out.println("verification of value chaitu: "+m.containsValue("chaitu"));
        System.out.println("verification of value amma: "+m.containsValue("amma"));
        System.out.println();


        m.put(103,"Amma");
        System.out.println(m);

        //Updation of the values and if they are absent
        m.put(103,"Anasuya");
        m.putIfAbsent(104,"Venkatesh");
        m.putIfAbsent(101,"Chaitu.m");
        System.out.println(m);
        System.out.println();

        //Updation we can also use replace.
        m.replace(104,"Mummineni Venkatesh");
        System.out.println(m);
        System.out.println();

        // Retrieval of Entries using EntrySet.
        Set<Map.Entry<Integer, String>> entries=m.entrySet();
        for(Map.Entry<Integer,String> entry:entries)
        {
            Integer key=entry.getKey();
            String values=entry.getValue();
            System.out.println(key +">>>>"+ values);
        }
        System.out.println();
        //Map size
        System.out.println(m.size());
        m.clear();
        System.out.println(m);

    }
}
