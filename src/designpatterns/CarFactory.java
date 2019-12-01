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
public class CarFactory{
    public Car makeCar(String model) throws InexistentCarException{
        if(model.equalsIgnoreCase("palio")){
            return new Palio();
        } else if(model.equalsIgnoreCase("gol")){
            return new Gol();
        } else if(model.equalsIgnoreCase("siena")){
            return new Siena();
        }
        throw new InexistentCarException("Carro inexistente.");
    }
}
