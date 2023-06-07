package Enumeraciones;

public enum Ejercicio4NombreDeMujer {
    DIANA("Diana"), BIANCA("Bianca"), NURIA("Nuria"), FIORELA("Fiorela"), VERONICA("Veronica"), LUNA("Luna"), BRENDA("Brenda"),
    ROCIO("Rocio"), BARBARA("Barbara"), NICOLE("Nicole"), MELANIE("Melanie"), CAMILA("Camila"), MARIA("Maria"),
    MARIANA("Mariana"), ERICA("Erica"), ADRIANA("Adriana"), FRANCISCA("Francisca"), DANIELA("Daniela"), GUADA("Guada"), GABRIELA("Gabriela");
    String codigo;

    private Ejercicio4NombreDeMujer() {
    }

    private Ejercicio4NombreDeMujer(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
}
