class Sensor{
    public static Sensor[] sensores = new Sensor[8];
    public static  int tamano = 8;
    public static int posAnadir = 0;
    private String tipo;
    private double valor;
    public static int contador = 0;
    public static int f = 0;
    public Sensor(){
        
    }
    public Sensor(String t, double v){
        this.tipo = t;
        this.valor = v;
        sensores[posAnadir] = this;
        posAnadir++;
    }
    
    public void setTipo(String n){
        this.tipo = n;
    }
    public String getTipo(){
        return tipo;
    }
    public void setValor(double n){
        this.valor = n;
    }
    public double getValor(){
        return valor;
    }
    
        public String toString(){
        return "El tipo es: "+tipo+
                "\nEl valor es: "+valor;
    }
    public static String toStringSen(Sensor[] arr){
        String text = "";
        for(int i = 0;i<posAnadir;i++){
            text = text +"\n"+"\n"+ arr[i].toString();
        }
        return text;
    }
    public static String filtrarTemperatura(String t){
        String text = "";
        for(int i = 0;i<posAnadir;i++){
            if(sensores[i].getTipo().equals(t)){
            text = text +"\n"+"\n"+ sensores[i].toString();
            }
        }
        return text;
    }
     public static String toStringSe(Sensor[] arr){
        String text = "";
        for(int i = 0;i<contador;i++){
            text = text +"\n"+"\n"+ arr[i].toString();
        }
        return text;
    }
    public static Sensor[] ordenarTemperatura(String t){
        for(int i = 0;i<posAnadir;i++){
            if(sensores[i].getTipo().equals(t)){
            contador++;
            }
        }
        Sensor[] temp = new Sensor[contador];
        for(int i = 0;i<contador;i++){
            if(sensores[i].getTipo().equals(t)){
            temp[f] = sensores[i];
            f++;
            }
        }
        for(int i = 0; i < contador; i++){
            for(int j = 0; j < Sensor.contador - 1; j++){
                Sensor guardado = temp[j];
                if (temp[j].getValor() > temp[j + 1].getValor()){
                    temp[j] = temp[j +1];
                    temp[j+1] = guardado;
                }
            }
        }
        return temp;
    }
    public static int cantidadSensores(){
        return posAnadir;
    }
}
