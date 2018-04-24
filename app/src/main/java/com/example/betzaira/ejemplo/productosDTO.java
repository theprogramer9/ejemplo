package com.example.betzaira.ejemplo;

import android.graphics.drawable.Drawable;

public class productosDTO {
    private int clave;
    private String nombre_producto;
    private String descripcion;
    private double precio;
    private double kilogramos;
    private String nombre_imagen;
    Drawable imagen;
    private double importe;

    public productosDTO() {
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getKilogramos() {
        return kilogramos;
    }

    public void setKilogramos(double kilogramos) {
        this.kilogramos = kilogramos;
    }

    public String getNombre_imagen() {
        return nombre_imagen;
    }

    public void setNombre_imagen(String nombre_imagen) {
        this.nombre_imagen = nombre_imagen;
    }

    public Drawable getImagen() {
        return imagen;
    }

    public void setImagen(Drawable imagen) {
        this.imagen = imagen;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    //    @Override
//    public String toString() {
//        StringBuffer sb = new StringBuffer();
//        sb.append("Id Carne ").append(getIdCarne()).append("\n");
//        sb.append("Nombre de Producto ").append(getNombreProducto()).append("\n");
//        sb.append("Costo a Venta ").append(getPrecioVenta()).append("\n");
//        sb.append("Descripcion ").append(getDescripcion()).append("\n");
//        sb.append("Venta Id ").append(getVentaId()).append("\n");
//        return sb.toString();
//    }
    @Override
    public String toString() {
        return nombre_producto;
    }

}

