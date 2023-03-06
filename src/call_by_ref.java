public class call_by_ref {
    int a,b;
    public static void ref(call_by_ref ob)
    {
        ob.a=ob.a+ob.b;
        ob.b=ob.a-ob.b;
        ob.a=ob.a-ob.b;
        System.out.println("During swap:"+ob.a+" "+ob.b);
    }
    public static void main(String[] args) {
        call_by_ref c=new call_by_ref();
         c.a=10;
         c.b=20;
        System.out.println("Before swap:"+c.a +" "+c. b);
        ref(c);
        System.out.println("After swap:"+c.a+" "+c.b);

    }
}
