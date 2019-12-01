/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns;

/**
 *
 * @author Flavia
 */
public class CarRental {
    private Car car;
    private State status = new Rented();
    private int daysOfRental;
    private Optional op;
    
    public CarRental(Car car, int days, Optional op){
        this.car = car;
        this.daysOfRental = days;
        this.op = op;
    }
    
    public void getTotalPrice(){
        this.status.getTotalPrice(daysOfRental);
    }
    
    public void finishRental(){
        this.status = new Finished();
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public State getStatus() {
        return status;
    }

    public void setStatus(State status) {
        this.status = status;
    }

    public int getDaysOfRental() {
        return daysOfRental;
    }

    public void setDaysOfRental(int daysOfRental) {
        this.daysOfRental = daysOfRental;
    }

    public Optional getOp() {
        return op;
    }

    public void setOp(Optional op) {
        this.op = op;
    }
    
    
}
