public class autoboxing_unbox{
    public static void main(String[] args) {
        Integer i=10;
        int j=i;
        System.out.println("AutoBoxing:"+j);
        int p=20;
        Integer q=(Integer)p;
        System.out.println("UnBoxing:"+q);
    }
}
