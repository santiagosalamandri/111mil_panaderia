package panaderia;

import java.util.List;

public class Caja {
    
    /*Atributos*/
    
    private List<Dinero> efectivo;
    private float aperturaCaja;
    private float cierreCaja;
    
    /*Constructor*/
    
    public Caja(List<Dinero> efectivo, float aperturaCaja, float cierreCaja){
        this.efectivo = efectivo;
        this.aperturaCaja = aperturaCaja;
        this.cierreCaja = cierreCaja;
    }
    
    /*Metodos*/
    
    public List<Dinero> getEfectivo(){
        return efectivo;
    }
    
    public void setEfectivo(List<Dinero> efectivo){
        this.efectivo = efectivo;
    }
    
    public float getAperturaCaja(){
        return aperturaCaja;
    }
    
    public void setAperturaCaja(float aperturaCaja){
        this.aperturaCaja = aperturaCaja;
    }
    
    public float getCierreCaja(){
        return cierreCaja;
    }
    
    public void setCierreCaja(float cierreCaja){
        this.cierreCaja = cierreCaja;
    }
    
    public void agregarDinero(){
        
    }
    
    public void quitarDinero(){
        
    }
    
    @Override
    public String toString(){
        return "Caja { Efectivo = " + this.efectivo + ", AperturaCaja = " + this.aperturaCaja + ", CierreCaja = " + this.cierreCaja + " }";  
    }
}