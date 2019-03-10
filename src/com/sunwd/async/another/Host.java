package com.sunwd.async.another;

public class Host {
    public  FutureData  request(final int count, final char c) {  
        System.out.println("request(" + count + ", " + c + ") BEGIN");  
  
        // (1) 建立FutureData的实体  
        final FutureData future = new FutureData();  
  
        // (2) 为了建立RealData的实体，启动新的线程  
        new Thread() {                                        
            public void run() {   
             //在匿名内部类中使用count、future、c。                        
                RealData realdata = new RealData(count, c);  
                future.setRealData(realdata);  
            }                                                 
        }.start();                                            
  
        System.out.println("request(" + count + ", " + c + ") END");  
  
        // (3) 取回FutureData实体，作为传回值  
        return future;  
    }  
}
