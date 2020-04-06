package com.utn;

public class CuentaBancaria {
    private int id;
    private String nombre;
    private float balance;

    public CuentaBancaria(int id, String nombre, float balance) {
        setId(id);
        setNombre(nombre);
        setBalance(balance);
    }

    private int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getBalance() {
        return balance;
    }

    private void setBalance(float balance) {
        this.balance = balance;
    }

    public float credito(float dineroADepositar) {
        setBalance(getBalance() + dineroADepositar);
        return balance;
    }

    public float debito(float dineroARetirar) {
        try {
            if (getBalance() - dineroARetirar >= 0)
                setBalance(getBalance() - dineroARetirar);
            else
                throw new Exception("Fondos insuficientes.");
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return balance;
    }

    public void mostrarDatos() {
        System.out.println("CuentaBancaria["
                + "Id=" + getId()
                + ", Nombre=" + getNombre()
                + ", Balance=" + getBalance() + ']');
    }

}
