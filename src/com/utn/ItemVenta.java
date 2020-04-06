package com.utn;

public class ItemVenta {
    private int id;
    private String descripcion;
    private int cantidad;
    private float pUnitario;

    public ItemVenta(int id, String descripcion, int cantidad, float pUnitario) {
        setId(id);
        setDescripcion(descripcion);
        setCantidad(cantidad);
        setpUnitario(pUnitario);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getpUnitario() {
        return pUnitario;
    }

    public void setpUnitario(float pUnitario) {
        this.pUnitario = pUnitario;
    }

    private float precioTotal() {
        return (float)cantidad * pUnitario;
    }

    public void mostrar() {
        System.out.println("ItemVenta[id=" + id
                + ", descripcion=" + descripcion
                + ", cantidad=" + cantidad
                + ", pUnitario=" + pUnitario
                + ", pTotal=" + precioTotal() + ']');
    }
}
