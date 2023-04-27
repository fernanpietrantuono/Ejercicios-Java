package pooconcolecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class PrácticaColecciones1 {

    public static void main(String[] args) {
        ArrayList<Integer> cantidadAlumnos = new ArrayList();
        HashSet<Integer> capacidadInstitucion = new HashSet();
        HashMap<Integer, String> persona = new HashMap();
        cantidadAlumnos.add(50);
        cantidadAlumnos.add(29);
        capacidadInstitucion.add(140);
        capacidadInstitucion.add(179);
        persona.put(48956894, "Armando");
        persona.put(41364189, "Francisca");
        System.out.println(cantidadAlumnos.size());
        System.out.println(cantidadAlumnos);
        cantidadAlumnos.remove(0);
        System.out.println(cantidadAlumnos);
        System.out.println(capacidadInstitucion.size());
        System.out.println(capacidadInstitucion);
        capacidadInstitucion.remove(179);
        System.out.println(capacidadInstitucion);
        System.out.println(persona.size());
        System.out.println(persona);
        persona.remove(48956894);
        persona.entrySet().forEach((entry) -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
    }
}
