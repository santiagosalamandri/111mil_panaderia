package panaderia;

import java.util.List;

public class Caja {
    
    /*Atributos*/
    
    private List<Dinero> efectivo;
    
    /*Constructor*/
    
    public Caja(List<Dinero> efectivo){
        this.efectivo = efectivo;
    }
    
    /*Metodos*/
    
    public List<Dinero> getEfectivo(){
        return efectivo;
    }
    
    public void setEfectivo(List<Dinero> efectivo){
        this.efectivo = efectivo;
    }
    
    public void agregarDinero(List<Dinero> pago){
        for(int i=0; i<pago.size(); i++){
            efectivo.add(pago.get(i));
        }
    }
    
    public void quitarDinero(List<Dinero> quitado){
        for(int i=0; i<quitado.size(); i++){
            efectivo.remove(quitado.get(i));
        }
    }
    public float calcularTotalEfectivo(List<Dinero> efectivo){
        float totalEfectivo = 0;
        for(int i=0; i<efectivo.size(); i++){
            totalEfectivo = totalEfectivo + efectivo.get(i).getDenominacion();
        }
        return totalEfectivo;
    }
    
    @Override
    public String toString(){
        return "Caja { Efectivo = " + this.calcularTotalEfectivo(efectivo) +" }";  
    }
}