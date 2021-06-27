
public class RAM {
    private int tiempoActual;
    private static String[] memoryRepresentation = new String[54];



    public RAM() {
        this.tiempoActual = 0;
        for(int i = 0;  i<54; i++){
            memoryRepresentation[i] = "";
        }

    }



    public void addProceso(String nombreProceso, int tamanio){

        for(int i = 0; i<54; i++){
            if(memoryRepresentation[i] == ""){
                Boolean flag = false;
                for(int j = 1; j<tamanio; j++){
                    if(memoryRepresentation[i+j] != ""){
                        flag = true;
                        break;
                    }
                }

                if(flag == false){
                    for(int j = 0; j<=tamanio; i++){
                        memoryRepresentation[i+j] = nombreProceso;
                    }
                }
            }
        }

    }

    public void removeProceso(String nombreProceso){

        for(int i = 0; i < 54; i++){
            if(memoryRepresentation[i] == nombreProceso){
                memoryRepresentation[i] = "";
            }
        }

    }


    public void printMemory(){

        for(int i = 0; i < 54; i++){
            System.out.println("Posición: " + i + ", Valor: " + memoryRepresentation[i]);
        }

    }

   


    public int getTiempoActual() {
        return tiempoActual;
    }


    public void setTiempoActual(int tiempoActual) {
        this.tiempoActual = tiempoActual;
    }


    public static String[] getRamRepresentation() {
        return memoryRepresentation;
    }


    public static void setRamRepresentation(String[] memoryRepresentation) {
        RAM.memoryRepresentation = memoryRepresentation;
    }


}
