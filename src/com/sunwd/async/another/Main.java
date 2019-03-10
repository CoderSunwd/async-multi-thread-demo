package com.sunwd.async.another;

public class Main {

    public static void main(String[] args) {  
        System.out.println("main BEGIN");  
        Host host = new Host();  
        FutureData data1 = host.request(10, 'A');  
        FutureData data2 = host.request(20, 'B');  
        FutureData data3 = host.request(30, 'C');  
  
        System.out.println("main otherJob BEGIN");  
        try {  
            Thread.sleep(200);  
        } catch (InterruptedException e) {  
        }  
        System.out.println("main otherJob END");  
  
        System.out.println("data1 = " + data1.getContent());  
        System.out.println("data2 = " + data2.getContent());  
        System.out.println("data3 = " + data3.getContent());  
        System.out.println("main END");  
    }  
}
