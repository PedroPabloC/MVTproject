
public class RAM {
    private String[] memoryRepresentation = new String[54];



    public RAM() {
        for(int i = 0;  i<54; i++){
            memoryRepresentation[i] = "";
        }

    }





    public void addProceso(Proceso entrante) throws ArrayIndexOutOfBoundsException{

        for(int i = 0; i<54; i++){
            if(memoryRepresentation[i] == ""){
                Boolean flag = false;
            
                for(int j = 1; j<(entrante.getTamanio()-1); j++){
                    if(memoryRepresentation[i+j] != ""){
                        flag = true;
                        break;
                    }
                }
        

                if(flag == false){
                    for(int j = 0; j<entrante.getTamanio(); j++){
                        memoryRepresentation[i+j] = entrante.getNombre();
                        entrante.setEstado(true);
                    }
                    
                    break;
                }
            }
        }

    }

    public void removeProceso(Proceso saliente){

        for(int i = 0; i < 54; i++){
            if(memoryRepresentation[i].equals(saliente.getNombre())){
                memoryRepresentation[i] = "";
            }
        }

    }


    public void printMemory(){

        for(int i = 0; i < 54; i++){
            System.out.println("(" + i + ")" + " ||         " + memoryRepresentation[i] + "         || ");
        }

    }



   




    public String[] getRamRepresentation() {
        return memoryRepresentation;
    }


    public void setRamRepresentation(String[] memoryRepresentation) {
        this.memoryRepresentation = memoryRepresentation;
    }


}
