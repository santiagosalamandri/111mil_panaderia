package panaderia;

import java.util.List;

/**
 *
 * @author Gimena y Jonathan;
 */
public class Factura {
    private Pedido pedido;
    private Caja caja;
    private List<Dinero> pago;  

    public void setPedido(int pedido) {
        this.pedido = pedido;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }

    public void setPago(List<Dinero> pago) {
        this.pago = pago;
    }

    public int getPedido() {
        return pedido;
    }

    public Caja getCaja() {
        return caja;
    }

    public List<Dinero> getPago() {
        return pago;
    }    
   
   public float calcularTotalPago(){
       //necesita valor float de la Lista pago
       float total=0;
       for(int i =0; i<pago.size();i++ ){
          total=total + pago.get(i).getDenominacion();          
       }
       
       return total;
       
   }
   
   public float calcularTotalVuelto(){
       float vuelto=0;
       
       vuelto=calcularTotalPago()-pedido.calcularTotalPedido();
       
       return vuelto;
   }
   
   public List<Dinero> calcularVuelto (){
    //necesita listado de billetes y float de calcularTotalVuelto()  
       
       float vuelto=calcularTotalVuelto();
       List<Efectivo> efectivocaja = caja.getEfectivo();
       
       
       
    }
   
}


