public class Antony {
    public static void main(String[] args) {
        int a,b,c,d;
        for(a=1;a>=1&&a<1000;a++){
            b=a%10;
            c=(a/10)%10;
            d=a/100;
            if (b*b*b+c*c*c+d*d*d==a){
                System.out.println(a);
                System.out.println("\n");
            }
        }
    }
}
