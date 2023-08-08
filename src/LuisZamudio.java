public class LuisZamudio {
    private String nombre;
    private int id; 

    public LuisZamudio() {
    }

    public LuisZamudio(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "LuisZamudio{" + "nombre=" + nombre + ", id=" + id + '}';
    }

    public void mostrarNOmbre(){
        System.out.println("El nombre es: " + nombre);
    }
    
}
