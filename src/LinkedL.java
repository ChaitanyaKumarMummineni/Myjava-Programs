import java.util.*;
public class LinkedL {
    public static void main(String[] args) {

        // Creating an arraylist and adding elements to it.
        ArrayList<String>al=new ArrayList<>();
        al.add("aldata1");
        al.add("aldata2");
        al.add(1,"aldata3");
        System.out.println(al);

        //creating a linkedlist and adding elements to it.
        List<String> ll=new LinkedList<>();
        ll.add("data1");
        ll.add("data3");
        ll.add(1,"data2");
        System.out.println(ll);

        //adding the arraylist elements to the linked list
        ll.addAll(1,al);
        System.out.println(ll);

        //removing elements using index from the linked list.
        ll.remove(2);
        System.out.println(ll);

        //removing elements using the objects.
        ll.remove("aldata2");
        System.out.println(ll);

        //removing elements of the arraylist from linkedlist.
        ll.removeAll(al);
        System.out.println(ll);

        // adding the duplicates and null values into the linked list
        ll.add("data1");
        ll.add(0,"data1");
        ll.add(null);
        ll.add(null);
        System.out.println(ll);

        // In linkedlist by default it is not synchronized for multithreading only vector is synchronized
        //manually we can synchronize it
        Collections.synchronizedList(ll);

        //getting the elements from particular index.
        System.out.println("The get element is: "+ll.get(4));

        // we can set values at certain place
        ll.set(1,"setmethod");
        System.out.println(ll);

        // we can print elements as of array using for each loop and also using iterator interface.
        for (String s:ll) {
            System.out.println(s);
        }
        Iterator i=ll.iterator();
        while(i.hasNext()){
            System.out.println("using iterator: "+i.next());
        }

        //validating the elements in the linkedlist using contains method
        System.out.println(ll.contains("data1"));

        //clearing all the data from the linked list
        ll.clear();
        System.out.println(ll);
        }
    }

