package Ejecutores;

import Entidades.Calificacion;
import Servicios.CalificacionServicio;
import java.util.ArrayList;

public class VerCalificacion {

    public static void main(String[] args) {
        Calificacion [] estudiante = new Calificacion [8];
        CalificacionServicio registro = new CalificacionServicio();
        for (int i = 0; i < 8; i++) {
            estudiante[i] = registro.cargarDatos();
        }
        double promedio = registro.promedio(estudiante);
        ArrayList <String> AlumnosNotaSupDelPromedio;
        AlumnosNotaSupDelPromedio = registro.cargarAlumnosNotaMayorPromedio(estudiante, promedio);
        registro.mostrarNotasMayoresAlPromedio(AlumnosNotaSupDelPromedio);
    }

}
