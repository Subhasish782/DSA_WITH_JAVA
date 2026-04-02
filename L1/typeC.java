public class typeC {
    public static void main(String args[]) {
        //*Typecasting
        float a=25.12f;
        // int b=a;
        int b=(int) a;//here the typecasting is occur
        System.out.println(b);//in this case decimal ke sare value kat jate hain.
        //so output will be :- 25

        char ch='a';
        int number=ch;
        System.out.println(number);

        float a=2.13f;
        float b=3.27f;
        float c=4.56f;
        float gst=0.18f;

        double bill=a+b+c+gst;

        System.out.println(bill);

    }
}