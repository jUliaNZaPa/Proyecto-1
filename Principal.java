import java.util.Scanner;
class Principal{
    public static void main(String[]args){
        Principal.mostrarMenu();
    }
    public static void mostrarMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número segun lo siguiente:\n"+
        "0. Salir.\n"+
        "1. Agregar un nuevo vehiculo.\n"+
        "2. Mostrar todos los vehiculos agregados.\n"+
        "3. Mostrar cantidad de vehiculos actuales.\n"+
        "4. Mostrar vehiculos de color verde.\n"+
        "5. Mostrar vehiculos de modelos entre 2000 y 2021.\n"+
        "6. Agregar un nuevo Sensor.\n"+
        "7. Mostrar todos los sensores agregados.\n"+
        "8. Mostrar cantidad de sensores actuales.\n"+
        "9. Mostrar sensores de tipo temperatura.\n"+
        "666. Mostrar sensores de tipo temperatura de menor a mayor.\n");
        while(true){
            int numero = sc.nextInt();
            if(numero == 0){
                break;
            }
            else if(numero == 1){
                if(Vehiculo.posAnadir<10){
                    System.out.println("Ingrese el modelo del vehiculo.");
                    int modelo = sc.nextInt();
                    System.out.println("Ingrese la marca del vehiculo.");
                    String marca = sc.next();
                    System.out.println("Ingrese el valor comercial del vehiculo.");
                    double valorComercial = sc.nextDouble();
                    System.out.println("Ingrese el color del vehiculo.");
                    String color = sc.next();
                    Vehiculo otro = new Vehiculo(modelo, marca, valorComercial, color);
                    Vehiculo.vehiculos[Vehiculo.cantidadVehiculos()-1] = otro;
                }
                else{
                    System.out.println("Error base de datos llena");
                }
            }
            else if(numero == 2){
                System.out.println(Vehiculo.toStringVehiculos());
            }
            else if(numero == 3){
                System.out.println("La cantidad de vihiculos actuales es: "+
                Vehiculo.cantidadVehiculos());
            }
            else if(numero == 4){
                System.out.println(Vehiculo.filtrarColor("verde"));
            }
            else if(numero == 5){
                System.out.println(Vehiculo.filtrarModelo(2000,2021));
            }
            else if(numero == 6){
                if(Sensor.posAnadir<8){
                System.out.println("Ingrese el tipo del sensor.");
                    String tipo = sc.next();
                    System.out.println("Ingrese el valor del sensor.");
                    double valor = sc.nextDouble();
                    Sensor otro = new Sensor(tipo, valor);
                    Sensor.sensores[Sensor.cantidadSensores()-1] = otro;
                }
                else{
                    System.out.println("Error base de datos llena");
                }
            }
            else if(numero == 7){
                System.out.println(Sensor.toStringSen(Sensor.sensores));
            }
            else if(numero == 8){
                System.out.println("La cantidad de sensores actuales es: "+
                Sensor.cantidadSensores());
            }
            else if(numero == 9){
                System.out.println(Sensor.filtrarTemperatura("temperatura"));
            }
            else if(numero == 666){
                    System.out.println(Sensor.toStringSe(Sensor.ordenarTemperatura("temperatura")));
                    Sensor.contador = 0;
                    Sensor.f = 0;
            }
        }
    }
}
