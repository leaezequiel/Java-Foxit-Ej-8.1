
public class Superheroe {
    public int idSuper;
    public String editorial;
    public String nombreReal;
    public String nombreSuperHeroe;
    public int edad;
    public boolean esAvenger;
    
  Superheroe(){
  }

    public void presentacion(){
        System.out.println("Soy "+nombreSuperHeroe+" y mi nombre real es "+nombreReal);
        System.out.println("Mi ID de Superheroe es "+idSuper+". Mi edad es "+edad); 
        System.out.println("     ");
    }

    public int getIdSuper() {
        return idSuper;
    }

    public void setIdSuper(int idSuper) {
        this.idSuper = idSuper;
    }
   
    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getNombreReal() {
        return nombreReal;
    }

    public void setNombreReal(String nombreReal) {
        this.nombreReal = nombreReal;
    }

    public String getNombreSuperHeroe() {
        return nombreSuperHeroe;
    }

    public void setNombreSuperHeroe(String nombreSuperHeroe) {
        this.nombreSuperHeroe = nombreSuperHeroe;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isEsAvenger() {
        return esAvenger;
    }

    public void setEsAvenger(boolean esAvenger) {
        this.esAvenger = esAvenger;
    }
    
    
    public static void main(String[] args){
        //Para probar instancie uno con setters y getters.
        Superheroe IronMan = new Superheroe();
        IronMan.setIdSuper(1);
        IronMan.setEdad(44);
        IronMan.setEditorial("Marvel");
        IronMan.setEsAvenger(true);
        IronMan.setNombreReal("Tony Stark");
        IronMan.setNombreSuperHeroe("Iron Man");
        IronMan.presentacion();
        //y ahora como el video:
        Superheroe spiderMan = new Superheroe();
        spiderMan.idSuper=2;
        spiderMan.edad=19;
        spiderMan.esAvenger=true;
        spiderMan.nombreReal="Peter Parker";
        spiderMan.nombreSuperHeroe="Spider Man";
        spiderMan.presentacion();
        // Para que DC no se ponga celoso:
        Superheroe batman = new Superheroe();
        batman.setEdad(34);
        batman.setEditorial("DC");
        batman.setEsAvenger(false);
        batman.setIdSuper(3);
        batman.setNombreReal("Bruce Wayne");
        batman.setNombreSuperHeroe("Batman");
        batman.presentacion();
    }
}


