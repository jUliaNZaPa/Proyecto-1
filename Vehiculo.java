public class Vehiculo{
    public static Vehiculo[] vehiculos = new Vehiculo[10];
    public static int tamano = 10;
    public static int posAnadir = 0;
    private int modelo;
    private String marca;
    private double valorComercial;
    private String color;
    public Vehiculo(){
        
    }
    public Vehiculo(int mo, String ma, double va){
        this(mo,ma,va,"verde");
    }
    public Vehiculo(int mo, String ma, double va, String co){
        this.modelo = mo;
        this.marca = ma;
        this.valorComercial = va;
        this.color = co;
        vehiculos[posAnadir] = this;
        posAnadir ++;
    }
    
    public void setModelo(int n){
        this.modelo = n;
    }
    public int getModelo(){
        return modelo;
    }
    public void setMarca(String n){
        this.marca = n;
    }
    public String getMarca(){
        return marca;
    }
    public void setValorComercial(double n){
        this.valorComercial = n;
    }
    public double getValorComercial(){
        return valorComercial;
    }
    public void setColor(String n){
        this.color = n;
    }
    public String getColor(){
        return color;
    }
    
    public String toString(){
        return "El modelo es: "+modelo+
                "\nLa marca es: "+marca+
                "\nEl valor comercial es: "+valorComercial+
                "\nEl color es: "+color;
    }
    public static String toStringVehiculos(){
        String text = vehiculos[0].toString();
        for(int i = 1;i<posAnadir;i++){
            text = text +"\n"+"\n"+ vehiculos[i].toString();
        }
        return text;
    }
    public static String filtrarColor(String c){
        String text = "";
        for(int i = 0;i<posAnadir;i++){
            if(vehiculos[i].getColor().equals(c)){
            text = text +"\n"+"\n"+ vehiculos[i].toString();
            }
        }
        return text;
    }
    public static String filtrarModelo(int i, int f){
        String text = "";
        for(int s = 0;s<posAnadir;s++){
            if(Vehiculo.vehiculos[s].getModelo() >= i && Vehiculo.vehiculos[s].getModelo() <= f){
            text = text +"\n"+"\n"+ vehiculos[s].toString();
            }
        }
        return text;
    }
    public static int cantidadVehiculos(){
        return posAnadir;
    }
}
