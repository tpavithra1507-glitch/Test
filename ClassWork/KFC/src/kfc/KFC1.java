package kfc;


public abstract class KFC1 {
    static {
        String protectname="Wings";
        int protectquantity;
        protectquantity = 2;
        int tablenumber=5;
        int amount=550;
        System.out.println("PROTECT NAME IS::"+protectname);
        System.out.println("PROTECT QUANTITY::"+protectquantity);
        System.out.println("TABLE NUMBER IS::"+tablenumber);
        System.out.println("AMOUNT IS::"+amount);
        
    }
    abstract void Bill(double discountprice);
}
