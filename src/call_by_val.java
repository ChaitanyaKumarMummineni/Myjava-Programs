public class call_by_val{
    static void swap(int a,int b)
    {
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("During swap:"+a+" "+b);
    }
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("Before swap:"+a +" "+ b);
        swap(a,b);
        System.out.println("After swap:"+a+" "+b);
    }
}
