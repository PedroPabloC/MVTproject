import java.util.ArrayList;

public class TablasMaker {
    public static ArrayList<Tabla> listaProcesos;
    public static ArrayList<Tabla> listaParticiones;


    public TablasMaker(){
        this.listaParticiones = new ArrayList<>();
        this.listaProcesos = new ArrayList<>();
    }



    public static ArrayList<Tabla> getListaProcesos() {
        return listaProcesos;
    }

    public static void setListaProcesos(ArrayList<Tabla> listaProcesos) {
        TablasMaker.listaProcesos = listaProcesos;
    }

    public static ArrayList<Tabla> getListaParticiones() {
        return listaParticiones;
    }

    public static void setListaParticiones(ArrayList<Tabla> listaParticiones) {
        TablasMaker.listaParticiones = listaParticiones;
    }


    public void actualizarTablas(String[] ram){
        actualizarAreasLibres(ram);
        actualizarListaParticiones(ram);
    }


    private void actualizarListaParticiones(String[] ram){
        ArrayList<Tabla> aux = new ArrayList<>();
        for(int i = 0; i<ram.length; i++){
            if(ram[i] != ""){
                for(int j = i+1; j<ram.length; j++){
                    String inicio = ram[i];
                    if(inicio != ram[j]){
                        aux.add(new Tabla(i,((j+1)-i), inicio));
                        i = j;
                        break;
                    }
                }
            }
        }
        listaParticiones = aux;
    }

    private void actualizarAreasLibres(String[] ram){
        ArrayList<Tabla> aux = new ArrayList<>();
        for(int i = 0; i<ram.length; i++){
            if(ram[i] == ""){
                for(int j = i+1; j<ram.length; j++){
                    if(ram[j] != ""){
                        aux.add(new Tabla(i,((j+1)-i), ""));
                        i = j;
                        break;
                    }
                    if(j == ram.length-1){
                        aux.add(new Tabla(i,((j+1)-i), ""));
                        i = j;
                        break;
                    }
                }
            }
        }

        listaProcesos = aux;

    }


    public void printTablas(){
        for(int i = 0; i<listaParticiones.size(); i++){
            System.out.println("    " + "No" + "    " + "localidad" + "    " + "Tamaño" + "    " + "Estado" + "    " + " Nombre");
            System.out.println("    " + i + "    " + listaParticiones.get(i).getLocalidad() + "    " +
                listaParticiones.get(i).getTamanio() + "    " + "Ocupado" + "    " + listaParticiones.get(i).getNombre());
        }


        for(int i = 0; i<listaProcesos.size(); i++){
            System.out.println("    " + "No" + "    " + "localidad" + "    " + "Tamaño" + "    " + "Estado" + "    ");
            System.out.println("    " + i + "    " + listaProcesos.get(i).getLocalidad() + "    " +
                listaProcesos.get(i).getTamanio() + "    " + "Disponible" + "    " + listaProcesos.get(i).getNombre());
        }

        
    }

}
