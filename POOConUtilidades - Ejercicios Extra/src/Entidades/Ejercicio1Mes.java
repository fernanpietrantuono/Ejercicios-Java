package Entidades;

public class Ejercicio1Mes {

    public String[] meses;
    public String mesSecreto;

    public Ejercicio1Mes() {
        this.meses = new String[] {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        this.mesSecreto = meses[(int) (Math.random() * 12)];
    }

    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

}
