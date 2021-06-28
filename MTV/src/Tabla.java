public class Tabla {
    private int localidad;
    private int tamanio;
    private String nombre;





    public Tabla(int localidad, int tamanio, String nombre) {
        this.localidad = localidad;
        this.tamanio = tamanio;
        this.nombre = nombre;
    }



    public int getLocalidad() {
        return localidad;
    }



    public void setLocalidad(int localidad) {
        this.localidad = localidad;
    }



    public int getTamanio() {
        return tamanio;
    }



    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }


    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
