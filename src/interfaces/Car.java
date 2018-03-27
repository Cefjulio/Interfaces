/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author auyon.j6356
 */
public class Car implements Vehicle {
    
    public String transportType = "Terrestrial";
    
    public int wheels;
    
    public Car(int wheels){
        this.wheels = wheels;
    
    }
    
    public String getTransportType(){
        return this.transportType;
    
    }
    
    public boolean hasWheels(){
    
        return wheels>0;
    }
    
    public int getNumberOfWheels(){
        return wheels;
    
    }
    
    
    
}
