package panaderia;

import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author Gimena y Jonathan;
 */
public class Factura {
    private Pedido pedido;
    private Caja caja;
    private List<Dinero> pago;  

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }

    public void setPago(List<Dinero> pago) {
        this.pago = pago;
    }

    public Pedido getPedido() {
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
       List<Dinero> efectivocaja = caja.getEfectivo();
       int[] dinerovuelto= new int [11];
       List<Dinero> dineroVuelto = new ArrayList<>();
     
       
       if(vuelto>500.0f){
           int contador500= 0;
           for(int i=0; i<caja.getEfectivo().size(); i++){
               if(caja.getEfectivo().get(i).getDenominacion()==500.0f){
                   contador500 ++;         
               } 
           }
           
           dinerovuelto[0]=contador500;
           
       }
       if(vuelto>200.0f){
           int contador200= 0;
           for(int i=0; i<caja.getEfectivo().size(); i++){
               if(caja.getEfectivo().get(i).getDenominacion()==200.0f){
                   contador200 ++;         
               } 
           }
            dinerovuelto[1]=contador200;
       }
       
      if(vuelto>100.0f){
           int contador100= 0;
           for(int i=0; i<caja.getEfectivo().size(); i++){
               if(caja.getEfectivo().get(i).getDenominacion()==100.0f){
                   contador100 ++;         
               } 
           }
           dinerovuelto[2]=contador100;
       }
      if(vuelto>50.0f){
           int contador50= 0;
           for(int i=0; i<caja.getEfectivo().size(); i++){
               if(caja.getEfectivo().get(i).getDenominacion()==50.0f){
                   contador50++;         
               } 
           }
            dinerovuelto[3]=contador50;
       }
      if(vuelto>20.0f){
           int contador20= 0;
           for(int i=0; i<caja.getEfectivo().size(); i++){
               if(caja.getEfectivo().get(i).getDenominacion()==20.0f){
                   contador20++;         
               } 
           }
           dinerovuelto[4]=contador20;
       }
      if(vuelto>10.0f){
           int contador10= 0;
           for(int i=0; i<caja.getEfectivo().size(); i++){
               if(caja.getEfectivo().get(i).getDenominacion()==10.0f){
                   contador10++;         
               } 
           }
           dinerovuelto[5]=contador10;
       }
      if(vuelto>5.0f){
           int contador5= 0;
           for(int i=0; i<caja.getEfectivo().size(); i++){
               if(caja.getEfectivo().get(i).getDenominacion()==5.0f){
                   contador5++;         
               } 
           }
           dinerovuelto[6]=contador5;
       }
      if(vuelto>2.0f){
           int contador2= 0;
           for(int i=0; i<caja.getEfectivo().size(); i++){
               if(caja.getEfectivo().get(i).getDenominacion()==2.0f){
                   contador2 ++;         
               } 
           }
           dinerovuelto[7]=contador2;
       }
      if(vuelto>1.0f){
           int contador1= 0;
           for(int i=0; i<caja.getEfectivo().size(); i++){
               if(caja.getEfectivo().get(i).getDenominacion()==1.0f){
                   contador1 ++;         
               } 
           }
           dinerovuelto[8]=contador1;
       }
      if(vuelto>0.50f){
           int contador050= 0;
           for(int i=0; i<caja.getEfectivo().size(); i++){
               if(caja.getEfectivo().get(i).getDenominacion()==0.50f){
                   contador050 ++;         
               } 
           }
           dinerovuelto[9]=contador050;
       }
      if(vuelto>0.25f){
           int contador025= 0;
           for(int i=0; i<caja.getEfectivo().size(); i++){
               if(caja.getEfectivo().get(i).getDenominacion()==0.25f){
                   contador025 ++;         
               } 
           }
           dinerovuelto[10]=contador025;
       }
      
      int cantidadBilletes = 0;
      int resto = 0;
      for(int i=0; i<dinerovuelto.length; i++){
          if (vuelto >= convertirPosicionEnDenominacion(i)){
          cantidadBilletes = (int) (vuelto/convertirPosicionEnDenominacion(i));
          if(cantidadBilletes <= dinerovuelto[i]){
              continue;
          }
          resto = (int) (vuelto%convertirPosicionEnDenominacion(i));
          dinerovuelto[i]= dinerovuelto[i];   
      }
          
                
      }
      
      return null;
       
    }
   private float convertirPosicionEnDenominacion(int i){
       switch(i){
           case 0:
               return 500.0f;
           case 1:
               return 200.0f;
           case 2:
               return 100.0f;
           case 3:
               return 50.0f;
           case 4:
               return 20.0f;
           case 5:
               return 10.0f;
           case 6:
               return 5.0f;
               
           case 7:
               return 2.0f;
           case 8:
               return 1.0f;
           case 9:
               return 0.5f;
           case 10:
               return 0.25f;
          default:
              return -1200.0f;
       }
   }
   
}


