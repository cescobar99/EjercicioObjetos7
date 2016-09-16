/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author User
 */
public class Hora {
private int horas;
private int minutos;
private int segundos;

public Hora() {
this.horas = 0;
this.minutos = 0;
this.segundos = 0;
}

public Hora(int horas, int minutos, int segundos) {
this.horas = horas;
this.minutos = minutos;
this.segundos = segundos;
}

public int getHoras() {
return horas;
}

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public String validacion() {
        String vali;
        if ((this.getHoras() <= 23) && (this.getMinutos() <= 59) && (this.getSegundos() <= 59)) {
            vali = "es correcta";
        } else {
            vali = "no es correcta";
        }
        return vali;
    }

    public String mostrar() {
        String aux;
        aux = this.getHoras() + ":" + this.getMinutos() + ":" + this.getSegundos();
        return aux;
    }

    public String comparacion(Hora h2) {
        String aux = null;
        if (this.getHoras() == h2.getHoras() && this.getMinutos() == h2.getMinutos() && this.getSegundos() == h2.getSegundos()) {
            aux = "Las horas son iguales";
        } else if (this.getHoras() < h2.horas) {
            aux = "La hora 1 es menor que la hora 2";
        } else if (this.getHoras() == h2.horas && this.getMinutos() < h2.getMinutos()) {
            aux = "La hora 1 es menor que la hora 2";
        } else if (this.getHoras() == h2.getHoras() && this.getMinutos() == h2.getMinutos() && this.getSegundos() < h2.getSegundos()) {
            aux = "La hora 1 es menor que la hora 2";
        } else if (this.getHoras() > h2.horas) {
            aux = "La hora 1 es mayor que la hora 2";
        } else if (this.getHoras() == h2.horas && this.getMinutos() > h2.getMinutos()) {
            aux = "La hora 1 es mayor que la hora 2";
        } else if (this.getHoras() == h2.getHoras() && this.getMinutos() == h2.getMinutos() && this.getSegundos() > h2.getSegundos()) {
            aux = "La hora 1 es mayor que la hora 2";
        }
        return aux;

    }   
}
