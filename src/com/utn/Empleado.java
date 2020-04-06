package com.utn;

public class Empleado {
    private int dni;
    private String nombre;
    private String apellido;
    private float salario;

    public Empleado(int dni, String nombre, String apellido, float salario) {
        setDni(dni);
        setNombre(nombre);
        setApellido(apellido);
        setSalario(salario);
    }

    public int getDni() {
        return dni;
    }

    private void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    private void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        if (salario <= 0)
            throw new IllegalArgumentException("No puede ser 0 o menor.");
        this.salario = salario;
    }

    public void mostrar() {
        System.out.println("Empleado[dni=" + this.getDni()
                + ", nombre=" + this.getNombre()
                + ", apellido=" + this.getApellido()
                + ", salario=" + this.getSalario()+"]");
    }

    public void aumentarSalario(int porcentaje) {
        this.setSalario(getSalario() * (1F + porcentaje / 100F));
    }
}
