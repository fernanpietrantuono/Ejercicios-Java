package Servicios;

import Entidades.Ejercicio3Clientes;
import Entidades.Ejercicio3Cuotas;
import Entidades.Ejercicio3Polizas;
import Entidades.Ejercicio3Vehiculos;
import Enumeradores.Ejercicio3Cobertura;
import Enumeradores.Ejercicio3FormaDePago;
import Enumeradores.Ejercicio3TipoDeVehiculo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio3SeguroServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private Ejercicio3Clientes cliente = new Ejercicio3Clientes();
    private Ejercicio3Polizas poliza = new Ejercicio3Polizas();
    private Ejercicio3Vehiculos vehiculo = new Ejercicio3Vehiculos();
    private ArrayList<Ejercicio3Polizas> polizas = new ArrayList();
    private ArrayList<Ejercicio3Cuotas> cuotas = new ArrayList();
    private double pagoFinal = 0;

    public void aniadirClientes() {
        System.out.println("Ingrese su nombre y apellido");
        cliente.setNombre(leer.next());
        cliente.setApellido(leer.next());
        System.out.println("Ingrese su documento de identidad");
        cliente.setDni(leer.nextLong());
        System.out.println("Ingrese su correo electrónico");
        cliente.setMail(leer.next());
        System.out.println("Ingrese su domicilio de residencia");
        cliente.setDomicilio(leer.next());
        System.out.println("Ingrese su número de teléfono");
        cliente.setTelefono(leer.nextLong());
    }

    public void llenarPoliza() {
        System.out.println("Ingrese el número de poliza:");
        poliza.setNumPoliza(leer.nextInt());
        System.out.println("¿Cuántas cuotas tenés para pagar?");
        poliza.setCantCuotas(leer.nextInt());
        Date inicioPoliza = new Date();
        poliza.setInicioPoliza(inicioPoliza);
        poliza.setFinPoliza(new Date(inicioPoliza.getYear() + 1, inicioPoliza.getMonth(), inicioPoliza.getDate()));
        System.out.println("Ingrese el monto total asegurado");
        poliza.setMontoTotalAsegurado(leer.nextDouble());
        System.out.println("¿La póliza incluye granizo?(Si/No)");
        String resp = leer.next();
        if (resp.equalsIgnoreCase("si")) {
            poliza.setGranizo(true);
            System.out.println("Ingrese el monto maximo asegurado por granizo");
            poliza.setMontoMaxGranizo(leer.nextDouble());
            pagoFinal = poliza.getMontoTotalAsegurado() + poliza.getMontoMaxGranizo();
        } else {
            poliza.setGranizo(false);
            pagoFinal = poliza.getMontoTotalAsegurado();
        }
        System.out.println("Ingrese el tipo de cobertura:\n1 - A\n2 - B\n3 - C\n4 - D");
        int opc = leer.nextInt();
        switch (opc) {
            case 1:
                poliza.setCobertura(Ejercicio3Cobertura.A);
                break;
            case 2:
                poliza.setCobertura(Ejercicio3Cobertura.B);
                break;
            case 3:
                poliza.setCobertura(Ejercicio3Cobertura.C);
                break;
            case 4:
                poliza.setCobertura(Ejercicio3Cobertura.D);
                break;
            default:
                System.out.println("La opción ingresada es incorrecta");
        }
        System.out.println("Ingrese la forma de pago:\n1 - Efectivo\n2 - Crédito\n3 - Débito\n4 - Transferencia");
        int opc2 = leer.nextInt();
        switch (opc2) {
            case 1:
                poliza.setFormaDePago(Ejercicio3FormaDePago.EFECTIVO);
                break;
            case 2:
                poliza.setFormaDePago(Ejercicio3FormaDePago.TARJETA_DE_CREDITO);
                break;
            case 3:
                poliza.setFormaDePago(Ejercicio3FormaDePago.TARJETA_DE_DEBITO);
                break;
            case 4:
                poliza.setFormaDePago(Ejercicio3FormaDePago.TRANSFERENCIA);
                break;
            default:
                System.out.println("La opción ingresada es incorrecta");
        }
    }

    public void aniadirVehiculos() {
        System.out.println("Ingrese la marca del vehículo");
        vehiculo.setMarca(leer.next());
        System.out.println("Ingrese el modelo del vehículo");
        vehiculo.setModelo(leer.next());
        System.out.println("Ingrese el año de fabricación del vehículo");
        vehiculo.setAnio(leer.nextInt());
        System.out.println("Ingrese la patente del vehículo");
        vehiculo.setPatente(leer.next());
        System.out.println("Ingrese el número de motor del vehículo");
        vehiculo.setNumMotor(leer.next());
        System.out.println("Ingrese el número de chasis del vehículo");
        vehiculo.setNumChasis(leer.next());
        System.out.println("Ingrese el color del vehículo");
        vehiculo.setColor(leer.next());
        System.out.println("Ingrese el tipo de vehículo:\n1 - Hatchback\n2 - Sedán\n3 - Familiar\n4 - Monovolumen\n5 - SUV\n6 - Pick Up\n7 - Utilitario");
        int opc = leer.nextInt();
        switch (opc) {
            case 1:
                vehiculo.setTipo(Ejercicio3TipoDeVehiculo.HATCHBACK);
                break;
            case 2:
                vehiculo.setTipo(Ejercicio3TipoDeVehiculo.SEDAN);
                break;
            case 3:
                vehiculo.setTipo(Ejercicio3TipoDeVehiculo.FAMILIAR);
                break;
            case 4:
                vehiculo.setTipo(Ejercicio3TipoDeVehiculo.MONOVOLUMEN);
                break;
            case 5:
                vehiculo.setTipo(Ejercicio3TipoDeVehiculo.SUV);
                break;
            case 6:
                vehiculo.setTipo(Ejercicio3TipoDeVehiculo.PICK_UP);
                break;
            case 7:
                vehiculo.setTipo(Ejercicio3TipoDeVehiculo.UTILITARIO);
                break;
            case 8:
                vehiculo.setTipo(Ejercicio3TipoDeVehiculo.MOTO);
                break;
            default:
                System.out.println("La opción ingresada es incorrecta");
        }
        poliza.setVehiculo(vehiculo);
    }

    public void pagoEnCuotas() {
        LocalDate fechaActual = LocalDate.now();
        double montoCuota = pagoFinal / poliza.getCantCuotas();
        for (int i = 1; i <= poliza.getCantCuotas(); i++) {
            LocalDate fechaCuota = fechaActual.plusMonths(i);
            cuotas.add(new Ejercicio3Cuotas(i, montoCuota, fechaCuota, poliza.getFormaDePago()));
        }
        poliza.setCuotas(cuotas);
        polizas.add(poliza);
        cliente.setPolizaCliente(polizas);
    }

    public void mostrarDatos() {
        System.out.println(cliente);
    }

}
