
public class Cmd
{
    public static void main(String[] a)
    {
        int regno, gc;
        String name, remarks;
        float s1,s2,s3,tot,avg;
        long phno;
        regno=Integer.parseInt(a[0]);
        name=a[1];
        gc=Integer.parseInt(a[2]);
        s1=Float.parseFloat(a[3]);
        s2=Float.parseFloat(a[4]);
        s3=Float.parseFloat(a[5]);
        phno=Long.parseLong(a[6]);
        tot=s1+s2+s3;
        avg=tot/3.0f;
        if(gc==1)
            remarks="Male";
        else
            remarks="Female";

        System.out.println("Regno is  : "+regno);
        System.out.println("Name is   : "+name);
        System.out.println("Gender is : "+remarks);
        System.out.println("Total is  : "+tot);
        System.out.println("Average is: "+avg);
        System.out.println("Phoneno is: "+phno);

    }
}
