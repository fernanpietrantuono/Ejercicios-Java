package Entidades;

public class DNI {

    private Long numDNI;
    private String letra;

    public DNI() {
    }

    public DNI(Long numDNI, String letra) {
        this.numDNI = numDNI;
        this.letra = letra;
    }

    public Long getNumDNI() {
        return numDNI;
    }

    public void setNumDNI(Long numDNI) {
        this.numDNI = numDNI;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "DNI{" + "numDNI=" + numDNI + ", letra=" + letra + '}';
    }
    
}
