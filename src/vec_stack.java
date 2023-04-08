import java.util.*;
//stack is class that provides some extra methods than the vector
public class vec_stack {

    public static void main(String[] args) {
        Stack<String> books=new Stack<>();//we can't create the stack with elements it should be empty
        books.add("red");
        books.add("black");
        books.add("white");
        books.add(null);
        books.add(null);
        books.remove(0);
        books.add(0,"white");
        System.out.println(books);
        books.set(0,"yellow");
        System.out.println(books);
        books.clear();
        System.out.println(books);

        // for the stack operations

        books.push("red");// push and add are the exactly equal
        books.push("black");
        books.push("white");
        //stack methods 1.push , 2.pop , 3.peek , 4.search
        System.out.println(books.peek());
        System.out.println(books);
        System.out.println(books.search("red"));
        System.out.println(books.indexOf("red"));
        System.out.println(books.pop());
        System.out.println(books);
        //empty() which is from stack and isEmpty() is the method from vector both returns the bool value if the size of the stack is zero or not
    }
}
