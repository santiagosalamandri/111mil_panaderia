/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gozie
 */
public class DetallePedido {
    private float cantidad;
    private TipoProducto tipoProducto;

    public DetallePedido(float cantidad, TipoProducto tipoProducto) {
        this.cantidad = cantidad;
        this.tipoProducto = tipoProducto;
    }
    
    public float calcularTotalDetalle (float cantidad, TipoProducto tipoProducto){
        float subTotal=0;
        subTotal=(tipoProducto.getPrecioUnitario())*this cantidad;
        return subTotal;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
    
    @Override
    public String toString (){
        return "Detalle de cantidad: " + this.cantidad + "Detalle de Tipo de Producto: " + this.tipoProducto;
    }
    
}
