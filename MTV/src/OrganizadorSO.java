import java.util.ArrayList;

public class OrganizadorSO {
    private RAM ram;
    private ArrayList<Proceso> listaProcesos;
    private int tiempoActual;
    private TablasMaker tablas;


    public OrganizadorSO(RAM ram, ArrayList<Proceso> listaProcesos) {
        this.ram = ram;
        this.listaProcesos = listaProcesos;
        this.tiempoActual = 1;
        this.tablas = new TablasMaker();
    }

    public void pasoN(){
        Boolean banderaSale = false;
        Boolean banderaEntra = false;



        if(banderaSale == false){
            for(Proceso actual : listaProcesos){
                try {
                    if(actual.getTiempoLlegada()== tiempoActual && actual.getEstado()==false){
                        ram.addProceso(actual);
                        banderaEntra = true;
                        tiempoActual +=1;
                        break;
                    }
                    
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("No hay suficiente espacio para la memoria");
                    break;
                }
            
            }
        }

        if(listaProcesos.size()==0){
            System.out.println("Finalizado");
        }else if(banderaSale == false && banderaEntra == false){
            int menor = 9999999;
            Proceso auxiliar = null;
            for(Proceso actual: listaProcesos){
                if(actual.getDuracion() + actual.getTiempoLlegada() < menor){
                    menor = actual.getDuracion() + actual.getTiempoLlegada();
                    auxiliar = actual;
                }
            }
            ram.removeProceso(auxiliar);
            listaProcesos.remove(auxiliar);
        }

        tablas.actualizarTablas(ram.getRamRepresentation());

        
    }

    public void agregarProceso(Proceso h){
        listaProcesos.add(h);
    }

    public RAM getRam(){
        return this.ram;
    }

    public TablasMaker getTablas() {
        return tablas;
    }

    public void setTablas(TablasMaker tablas) {
        this.tablas = tablas;
    }

    

}
