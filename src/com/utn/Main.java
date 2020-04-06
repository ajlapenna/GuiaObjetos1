package com.utn;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        ejercicio5();
    }

    public static void ejercicio1() {
        System.out.println("-------- Ejercicio 1 --------\n");
        //a. Inicializar un objeto Rectángulo estableciendo ancho y alto.
        var rectangulo = new Rectangulo(3,4);

        //b. Imprimir por pantalla el alto y ancho. 
        System.out.println("El ancho es " + rectangulo.getBase());
        System.out.println("El alto es " + rectangulo.getAltura());

        //c. Imprimir por pantalla el área y perímetro. 
        System.out.println("El perímetro es " + rectangulo.perimetro());
        System.out.println("El área es " + rectangulo.area());

        //d. Modificar el alto y el ancho de la instancia. 
        rectangulo.setAltura(5);
        rectangulo.setBase(8);

        //e. Imprimir por pantalla nuevamente el cálculo del área y perímetro. 
        System.out.println("El nuevo perímetro es " + rectangulo.perimetro());
        System.out.println("El nuevo área es " + rectangulo.area());
    }

    public static void ejercicio2() {
        //a. Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial de 25000
        var carlos = new Empleado(23456345, "Carlos", "Gutiérrez", 25000);

        //b. Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de 27500
        var ana = new Empleado(34234123, "Ana", "Sánchez", 27500);

        //c. Imprima ambos objetos por pantalla
        carlos.mostrar();
        ana.mostrar();

        //d. Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el
        //salario anual del mismo.
        carlos.aumentarSalario(15);
        System.out.println("El nuevo salario de " + carlos.getNombre() + " es "
                + NumberFormat.getCurrencyInstance().format(carlos.getSalario()));
    }

    public static void ejercicio3() {
        var boligrafo = new ItemVenta(123, "Bolígrafo", 5, 20.25F);
        boligrafo.mostrar();
    }

    public static void ejercicio4() {
        var cuenta1 = new CuentaBancaria(132, "Iván", 15_000F);
        cuenta1.credito(2500);
        cuenta1.debito(1500);
        cuenta1.debito(30_000);
        cuenta1.mostrarDatos();
    }

    public static void ejercicio5() {
        var instante = new Hora();
        System.out.println(instante.mostrarHora());
        System.out.println(instante.avanzar1Segundo().mostrarHora());
        System.out.println(instante.retroceder1Segundo().mostrarHora());
    }
}
