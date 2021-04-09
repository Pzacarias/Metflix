public class Idioma {

    public Idioma(String nombre, String alfabeto){
        this.nombre = nombre;
        this.alfabeto = alfabeto;
    }

    private String nombre;
    private String alfabeto;

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
 
    public String getAlfabeto(){
        return this.alfabeto;
    }
    public void setAlfabeto (String alfabeto){
        this.alfabeto = alfabeto;
    }
}
