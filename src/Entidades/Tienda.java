
package Entidades;



public class Tienda {
    
  private Double precio;
  private String articulo;

    public Tienda(Double precio, String articulo) {
        this.precio = precio;
        this.articulo = articulo;
    }

    public Tienda() {
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }
    
  
  
}
