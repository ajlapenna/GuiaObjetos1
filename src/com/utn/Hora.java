package com.utn;

import java.time.LocalTime;

public class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    public Hora() {
        LocalTime instante = LocalTime.now();
        setHoras(instante.getHour());
        setMinutos(instante.getMinute());
        setSegundos(instante.getSecond());
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        if(horas > 23 || horas < 0)
            throw new IllegalArgumentException("Hora inválida");
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if(minutos > 59 || minutos < 0)
            throw new IllegalArgumentException("Minuto inválido");
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if(segundos > 59 || segundos < 0)
            throw new IllegalArgumentException("Segundo inválido");
        this.segundos = segundos;
    }

    public String mostrarHora () {
        String horasF = String.format("%02d", getHoras());
        String minutosF = String.format("%02d", getMinutos());
        String segundosF = String.format("%02d", getSegundos());

        return horasF + ':' + minutosF + ':' + segundosF;
    }

    public Hora avanzar1Segundo() {
        setSegundos(getSegundos() + 1);
        return this;
    }

    public Hora retroceder1Segundo() {
        setSegundos(getSegundos() - 1);
        return this;
    }
}
