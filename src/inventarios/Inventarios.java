/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarios;

/**
 *
 * @author francisco
 */
public class Inventarios {

    private Integer cantidad;
    private Productos producto;

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Productos getProducto() {
        return producto;
    }

    public void setProducto(Productos producto) {
        this.producto = producto;
    }

    public Inventarios() {
        this.cantidad = 0;
        this.producto = null;
    }

    public Inventarios(Integer cantidad, Productos producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

}
