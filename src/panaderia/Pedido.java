package panaderia;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author utku30
 */
public class Pedido {
    
    private List<DetallePedido> detalles;

    public Pedido() {
        detalles = new ArrayList();
    }
    
    public Pedido(List<DetallePedido> detalles) {
        this.detalles = detalles; 
    }
    
    public void cancelarDetalle(DetallePedido detalle) {
        detalles.remove(detalle);
    }
    
    public float calcularTotalPedido() {
        float totalPedido = 0.0f;
        for(DetallePedido detalle : detalles) {
            totalPedido += detalle.calcularTotalDetalle();
        }
        
        return totalPedido;
    }

    @Override
    public String toString() {
        String retornoFuncion = "";
        for(DetallePedido detalle : detalles) {
            retornoFuncion += detalle.toString() + "\n";
        }
        return retornoFuncion;
    }
    
}
