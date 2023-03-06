public class Varargs {
    public static <T> void  varargs1(T ...a)
    {
        System.out.println("varargs1: ");
        for(T i:a)
        {
            System.out.println(i);
        }
    }
    public static <T> void  varargs2(T b[])
    {
        System.out.println("varargs2: ");
        for(T j:b)
        {
            System.out.println(j);
        }
    }
    public static void  varargs3(Object ...ob)
    {
        System.out.println("varargs3: ");
        for(Object i:ob)
        {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        varargs2(new String[]{"chaitu","hello"});
        varargs2(new Integer[]{1,2,3,4,5,6,7});
        varargs1("hari",141,47);
        varargs3("hello","this "," chaitu",143);
    }
}
