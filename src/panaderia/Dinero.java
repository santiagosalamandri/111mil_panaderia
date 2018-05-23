/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panaderia;

/**
 *
 * @author utku37
 */
public class Dinero {
    private float denominacion;
    private TipoDinero iD;

    public Dinero(float denominacion, TipoDinero iD) {
        this.denominacion = denominacion;
        this.iD = iD;
    }

    public float getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(float denominacion) {
        this.denominacion = denominacion;
    }

    public TipoDinero getiD() {
        return iD;
    }

    public void setiD(TipoDinero iD) {
        this.iD = iD;
    }
    
    public String toString(){
        return "Denominacion: "+this.denominacion+". ID: "+this.iD+".";
    }
    
}
