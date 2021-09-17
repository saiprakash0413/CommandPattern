package com.motorcyclescommandpattern.invoker;
/*author Saiprakash Reddy*/

import java.util.Scanner;

public class RemoteControl {
	
	public void on()
    {
        System.out.println("FM is on");
    }
    public void off()
    {
        System.out.println("FM is off");
    }
    public void speed() {
    	 Scanner in = new Scanner(System.in);
         double e,a=300,b=50,c=30,d=22;
         e=(a-b)/(c-d);
         System.out.println("Acceleration = "+e+"m/s");
    }
    public void music()
    {
        System.out.println("-----------Music Started--------------");
    }
    public void move() {
    	boolean keyInserted=true;
    	if(keyInserted==true) {
    		System.out.println("Bike Started..!!!Have a safe Ride:)");
    	}else {
    		System.out.println("Please Insert the key and Start Bike");
    	}
    }
    public void mileage()
    { 
        double petrol=5.2;     
        double km=70;    
        
        double vehicleMileage = km / petrol;   
    
       
        System.out.println("Vehicle Mileage----->" +""+vehicleMileage);
    }

    public void setVolume(int volume)
    {
      
       System.out.println("FM volume set"
                          + " to " + volume);
    }
}
