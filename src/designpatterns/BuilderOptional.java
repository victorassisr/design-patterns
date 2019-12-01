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
public class BuilderOptional {
    
    private Optional op = new Optional();
    
    public BuilderOptional ar() {
        this.op.setAr(true);
        return this;
    }
    
    
    public BuilderOptional direcaoHidraulica() {
        this.op.setDirecaoHidraulica(true);
        return this;
    }
    
    public BuilderOptional som() {
        this.op.setSom(true);
        return this;
    }
    
    public Optional build() {
        return this.op;
    }
}
