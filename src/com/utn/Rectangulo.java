package com.utn;

public class Rectangulo {
    private int base;
    private int altura;

    public Rectangulo (int base, int altura) {
        setBase(base);
        setAltura(altura);
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        if (base <= 0)
            throw new IllegalArgumentException("No puede ser 0 o menor.");
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        if (altura <= 0)
            throw new IllegalArgumentException("No puede ser 0 o menor.");
        this.altura = altura;
    }

    public int perimetro() {
        return (base + altura) * 2;
    }

    public int area() {
        return base * altura;
    }
}
