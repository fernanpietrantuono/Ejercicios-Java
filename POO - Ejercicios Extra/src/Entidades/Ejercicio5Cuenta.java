package Entidades;

import java.util.Scanner;

public class Ejercicio5Cuenta {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public String titular;
    public double saldo;

    public Ejercicio5Cuenta() {
    }

    public Ejercicio5Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double TransferenciaYDeposito() throws InterruptedException {
        System.out.println("Ingrese el CVU/CBU y el monto a enviar");
        long cvu = leer.nextLong();
        int monto = leer.nextInt();
        System.out.println("Deposite su dinero en el sobre, ciérrelo y desposítelo en la ranura");
        saldo -= monto;
        System.out.println("La transferencia al CVU/CBU n° " + cvu + " ha sido enviada exitosamente");
        Thread.sleep(3000);
        System.out.println("Imprimiendo recibo");
        Thread.sleep(1500);
        return saldo;
    }

    public double RetirarDinero() throws InterruptedException {
        String respRecibo = "";
        System.out.println("Ingrese una moneda. Dólares o pesos?");
        String moneda = leer.next();
        if (moneda.equals("pesos")) {
            System.out.println("Seleccione el monto");
            System.out.println("1. $50");
            System.out.println("2. $100");
            System.out.println("3. $250");
            System.out.println("4. $500");
            System.out.println("5. $750");
            System.out.println("6. $1000");
            System.out.println("7. $1250");
            System.out.println("8. Otro importe");
            int opcOperacion = leer.nextInt();
            if (opcOperacion >= 1 && opcOperacion <= 7) {
                System.out.println("¿Quiere imprimir el recibo de operación?");
                respRecibo = leer.next();
                System.out.println("Operación en proceso");
                Thread.sleep(15000);
                switch (opcOperacion) {
                    case 1:
                        saldo -= 50;
                        break;
                    case 2:
                        saldo -= 100;
                        break;
                    case 3:
                        saldo -= 250;
                        break;
                    case 4:
                        saldo -= 500;
                        break;
                    case 5:
                        saldo -= 750;
                        break;
                    case 6:
                        saldo -= 1000;
                        break;
                    case 7:
                        saldo -= 1250;
                        break;
                }
                System.out.println("Retire su dinero");
                Thread.sleep(3000);
                if (respRecibo.equals("si")) {
                    System.out.println("Imprimiendo recibo");
                    Thread.sleep(1500);
                }
            } else if (opcOperacion == 8) {
                System.out.println("Ingrese un importe");
                double importe = leer.nextDouble();
                System.out.println("¿Quiere imprimir el recibo de operación?");
                respRecibo = leer.next();
                System.out.println("Operación en proceso");
                Thread.sleep(15000);
                saldo -= importe;
                System.out.println("Retire su dinero");
                Thread.sleep(3000);
                if (respRecibo.equals("si")) {
                    System.out.println("Imprimiendo recibo");
                    Thread.sleep(1500);
                }
            }
        } else if (moneda.equals("dolares")) {
            double dolar;
            int opcOperacion;
            System.out.println("Seleccione el monto");
            System.out.println("1. U$D 50");
            System.out.println("2. U$D 100");
            System.out.println("3. U$D 250");
            System.out.println("4. U$D 500");
            System.out.println("5. U$D 750");
            System.out.println("6. U$D 1000");
            System.out.println("7. U$D 1250");
            System.out.println("8. Otro importe");
            opcOperacion = leer.nextInt();
            if (opcOperacion >= 1 && opcOperacion <= 7) {
                System.out.println("¿Quiere imprimir el recibo de operación?");
                respRecibo = leer.next();
                System.out.println("Operación en proceso");
                Thread.sleep(15000);
                switch (opcOperacion) {
                    case 1:
                        dolar = 214.71 * 50;
                        saldo -= dolar;
                        break;
                    case 2:
                        dolar = 214.71 * 100;
                        saldo -= dolar;
                        break;
                    case 3:
                        dolar = 214.71 * 250;
                        saldo -= dolar;
                        break;
                    case 4:
                        dolar = 214.71 * 500;
                        saldo -= dolar;
                        break;
                    case 5:
                        dolar = 214.71 * 750;
                        saldo -= dolar;
                        break;
                    case 6:
                        dolar = 214.71 * 1000;
                        saldo -= dolar;
                        break;
                    case 7:
                        dolar = 214.71 * 1250;
                        saldo -= dolar;
                        break;
                }
                System.out.println("Retire su dinero");
                Thread.sleep(3000);
                if (respRecibo.equals("si")) {
                    System.out.println("Imprimiendo recibo");
                    Thread.sleep(1500);
                }
            } else if (opcOperacion == 8) {
                System.out.println("Ingrese un importe");
                double importe = leer.nextDouble();
                System.out.println("¿Quiere imprimir el recibo de operación?");
                respRecibo = leer.next();
                System.out.println("Operación en proceso");
                Thread.sleep(15000);
                dolar = 214.71 * importe;
                saldo -= dolar;
                System.out.println("Retire su dinero");
                Thread.sleep(3000);
                if (respRecibo.equals("si")) {
                    System.out.println("Imprimiendo recibo");
                    Thread.sleep(1500);
                }
            }
        }
        return saldo;
    }

    public int Claves() {
        int pin = 0;
        System.out.println("¿Qué clave quiere cambiar? ¿PIN o token?");
        String opcClave = leer.next();
        if (opcClave.equals("PIN")) {
            System.out.println("Ingrese una nueva clave PIN");
            int nuevoPIN = leer.nextInt();
            System.out.println("Ingrese nuevamente una nueva clave PIN para confirmar");
            nuevoPIN = leer.nextInt();
            pin = nuevoPIN;
        } else {
            System.out.println("Ingrese una nueva clave token");
            long nuevoToken = leer.nextLong();
            System.out.println("Ingrese nuevamente una nueva clave PIN para confirmar");
            nuevoToken = leer.nextLong();
        }
        return pin;
    }

    public void ConsultaDeSaldos() {
        System.out.println("Su saldo actual es de $" + saldo);
    }

    public void PagoMisCuentas() {
        System.out.println("Ingrese el número de cuenta");
        long numCuenta = leer.nextLong();
        System.out.println("Su cuenta al número " + numCuenta + " ha sido pagada exitosamente");
    }

    public double ExtraccionRapida() throws InterruptedException {
        System.out.println("Ingrese un importe");
        double importe = leer.nextDouble();
        System.out.println("¿Quiere imprimir el recibo de operación?");
        String respRecibo = leer.next();
        System.out.println("Operación en proceso");
        Thread.sleep(15000);
        saldo -= importe;
        System.out.println("Retire su dinero");
        Thread.sleep(3000);
        if (respRecibo.equals("si")) {
            System.out.println("Imprimiendo recibo");
            Thread.sleep(1500);
        }
        return saldo;
    }

    public double Recargas() throws InterruptedException {
        double importe = 0;
        System.out.println("¿Qué servicio desea recargar?");
        System.out.println("1. Celular");
        System.out.println("2. SUBE");
        int opcRecarga = leer.nextInt();
        if (opcRecarga == 1) {
            System.out.println("Ingrese el n° de cuenta de la operadora de servicio telefónico");
            long numCuenta = leer.nextLong();
            System.out.println("Seleccione el monto");
            System.out.println("1. $50");
            System.out.println("2. $100");
            System.out.println("3. $250");
            System.out.println("4. $500");
            System.out.println("5. $750");
            System.out.println("6. $1000");
            System.out.println("7. $1250");
            System.out.println("8. Otro importe");
            int opcOperacion = leer.nextInt();
            if (opcOperacion >= 1 && opcOperacion <= 7) {
                System.out.println("Operación en proceso");
                Thread.sleep(10000);
                switch (opcOperacion) {
                    case 1:
                        saldo -= 50;
                        break;
                    case 2:
                        saldo -= 100;
                        break;
                    case 3:
                        saldo -= 250;
                        break;
                    case 4:
                        saldo -= 500;
                        break;
                    case 5:
                        saldo -= 750;
                        break;
                    case 6:
                        saldo -= 1000;
                        break;
                    case 7:
                        saldo -= 1250;
                        break;
                }
                System.out.println("La recarga al n° [" + numCuenta + "] ha sido exitosa");
            } else if (opcOperacion == 8) {
                System.out.println("Ingrese un importe");
                importe = leer.nextDouble();
                System.out.println("Operación en proceso");
                Thread.sleep(10000);
                saldo -= importe;
                System.out.println("La recarga al n° [" + numCuenta + "] ha sido exitosa");
            }
        } else if (opcRecarga == 2) {
            System.out.println("Ingrese el n° de la tarjeta SUBE");
            long numTarjeta = leer.nextLong();
            System.out.println("Seleccione el monto");
            System.out.println("1. $50");
            System.out.println("2. $100");
            System.out.println("3. $250");
            System.out.println("4. $500");
            System.out.println("5. $750");
            System.out.println("6. $1000");
            System.out.println("7. $1250");
            System.out.println("8. Otro importe");
            int opcOperacion = leer.nextInt();
            if (opcOperacion >= 1 && opcOperacion <= 7) {
                System.out.println("Operación en proceso");
                Thread.sleep(10000);
                switch (opcOperacion) {
                    case 1:
                        saldo -= 50;
                        break;
                    case 2:
                        saldo -= 100;
                        break;
                    case 3:
                        saldo -= 250;
                        break;
                    case 4:
                        saldo -= 500;
                        break;
                    case 5:
                        saldo -= 750;
                        break;
                    case 6:
                        saldo -= 1000;
                        break;
                    case 7:
                        saldo -= 1250;
                        break;
                }
                System.out.println("La recarga de la tarjeta SUBE n° [" + numTarjeta + "] ha sido exitosa");
            } else if (opcOperacion == 8) {
                System.out.println("Ingrese un importe");
                importe = leer.nextDouble();
                System.out.println("Operación en proceso");
                Thread.sleep(10000);
                saldo -= importe;
                System.out.println("La recarga de la tarjeta SUBE n° [" + numTarjeta + "] ha sido exitosa");
            }
        }
        return saldo;
    }

    public void OtrasOperaciones() throws InterruptedException {
        long numCuenta = 0;
        System.out.println("¿Qué servicio quiere agregar o eliminar?");
        System.out.println("1. Seguro");
        System.out.println("2. Servicio básico");
        System.out.println("3. Cuentas de transferencia a terceros");
        int opcServicio = leer.nextInt();
        switch (opcServicio) {
            case 1:
                System.out.println("Ingrese el número de cuenta del seguro");
                numCuenta = leer.nextLong();
                System.out.println("Desea agregar o eliminar el número de cuenta [" + numCuenta + "] de tu homebanking?");
                String servicio = leer.next();
                if (servicio.equals("agregar")) {
                    System.out.println("Agregando servicio");
                    Thread.sleep(10000);
                    System.out.println("Servicio agregado");
                } else {
                    System.out.println("Eliminando servicio");
                    Thread.sleep(10000);
                    System.out.println("Servicio eliminado");
                }
                break;
            case 2:
                System.out.println("Ingrese el número de cuenta del servicio básico");
                numCuenta = leer.nextLong();
                System.out.println("Desea agregar o eliminar el número de cuenta [" + numCuenta + "] de tu homebanking?");
                servicio = leer.next();
                if (servicio.equals("agregar")) {
                    System.out.println("Agregando servicio");
                    Thread.sleep(10000);
                    System.out.println("Servicio agregado");
                } else {
                    System.out.println("Eliminando servicio");
                    Thread.sleep(10000);
                    System.out.println("Servicio eliminado");
                }
                break;
            case 3:
                System.out.println("Ingrese el número de cuenta del seguro");
                long CVUCBU = leer.nextLong();
                System.out.println("Desea agregar o eliminar el CVU/CBU n° [" + CVUCBU + "] de tu homebanking?");
                servicio = leer.next();
                if (servicio.equals("agregar")) {
                    System.out.println("Agregando CVU/CBU");
                    Thread.sleep(10000);
                    System.out.println("CVU/CBU agregado");
                } else {
                    System.out.println("Eliminando CVU/CBU");
                    Thread.sleep(10000);
                    System.out.println("CVU/CBU eliminado");
                }
                break;
            default:
                System.out.println("No existe la opción ingresada");
        }
    }
}
