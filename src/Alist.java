import java.util.*;
public class Alist extends ArrayList {
    public static void main(String[] args) {
        Alist a=new Alist();
        Integer [] arr=new Integer[]{1,2,3,8,4,5,6,7,8,9,0};
        ArrayList al=new ArrayList(Arrays.asList(arr));
        al.add(10);
        System.out.println(al);
        System.out.println(al.size());
        al.set(0,00);
        for(Object i:al){
            System.out.println(i);
        }
        System.out.println(al.clone());
       al.ensureCapacity(5);
        System.out.println();
        System.out.println(al.lastIndexOf(8));
        // alist class object is created to invoke the removeRange function since it has the protected access so only subclasses can use this function so
        // i extended the ArrayList and created an object for the subclass (Alist) then i added all list elements to the a (object) then we can remove it.
        a.addAll(al);
       a.removeRange(3,8);
        System.out.println("remove range"+a);

        System.out.println("sublist"+al.subList(3,8));
        System.out.println(al);

            al.toArray();
        System.out.println(al);
        System.out.println(al.size());
        // here the arraylist initial size is 10 when we add 12 elements the alist size will increase the half of the size of old arraylist.
        // Array list size will become the 15 the rest other 3 space are waste to remove those spaces we use --->>"trimToSize()" then capacity will become 12
        al.trimToSize();

    }
}
