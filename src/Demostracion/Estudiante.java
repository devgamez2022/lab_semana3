package Demostracion;
public class Estudiante extends Notas{
    int carnet;
    String nombre;
    String apellido;
    int edad;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellido = apellidos;
    }

    public Estudiante(int carnet, String nombre, String apellido, int edad) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    String informacion(){
        String datos = "\n";
        datos += "El nombre del estudiante es: " + this.nombre + "\n";
        datos += "Los apellidos del estudiante son: " + this.apellido + "\n";
        datos += "La edad del estudiante es: " + this.edad + "\n";
        return datos;
    }
    
    
    String info1(){
        String datos = "***************************\n";
        datos += "El nombre del estudiante es: " + this.getNombre() + "\n";
        datos += "Los apellidos del estudiante son: " + this.getApellido() + "\n";
        datos += "La edad del estudiante es: " + this.getEdad() + "\n";
        datos += "***************************\n";
        return datos;
    }
     
    String info3(Estudiante d){
        String datos = "%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n";
        datos += "El nombre del estudiante es: " + d.getNombre() + "\n";
        datos += "Los apellidos del estudiante son: " + d.getApellido() + "\n";
        datos += "La edad del estudiante es: " + d.getEdad()  + "\n";
        datos += "%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n";
        return datos;
    }
    
    String info3(int c, String n, String a, int e){
        String datos = "";
        datos += "El carnet del estudiante es: " + c + "\n";
        datos += "El nombre del estudiante es: " + n + "\n";
        datos += "Los apellidos del estudiante son: " + a + "\n";
        datos += "La edad del estudiante es: " + e + "\n";
        return datos;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
