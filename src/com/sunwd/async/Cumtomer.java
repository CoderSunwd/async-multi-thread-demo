package com.sunwd.async;

public class Cumtomer {
    public static void main(String[] args) {  
        System.out.println("main BEGIN");  
        CakeShop host = new CakeShop();  
        DeliveryOrder cake1 = (DeliveryOrder) host.request(10, 'A');
        DeliveryOrder cake2 = (DeliveryOrder) host.request(20, 'B');
        DeliveryOrder cake3 = (DeliveryOrder) host.request(30, 'C');
        System.out.println("main otherJob BEGIN");  
        try {  
            Thread.sleep(2000);  
        } catch (InterruptedException e) {  
        }  
  
        System.out.println("main otherJob END");  
        System.out.println("cake1 = " + cake1.getCake());  
        System.out.println("cake2 = " + cake2.getCake());  
        System.out.println("cake3 = " + cake3.getCake());  
        System.out.println("main END");  
  
    }  
}
