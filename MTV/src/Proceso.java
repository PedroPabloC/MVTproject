
public class Proceso {
    private String nombre;
    private int tamanio;
    private int tiempoLlegada;
    private int duracion;
    private Boolean estado;


    public Proceso(String nombre, int tamanio, int tiempoLlegada, int duracion) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.tiempoLlegada = tiempoLlegada;
        this.duracion = duracion;
        this.estado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public int getTiempoLlegada() {
        return tiempoLlegada;
    }

    public void setTiempoLlegada(int tiempoLlegada) {
        this.tiempoLlegada = tiempoLlegada;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setTiempoFinalia(int duracion) {
        this.duracion = duracion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    
}
