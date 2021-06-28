import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Proceso procesoA = new Proceso("A", 8, 1, 7);
        Proceso procesoB = new Proceso("B", 14, 2, 7);
        Proceso procesoC = new Proceso("C", 18, 3, 4);
        Proceso procesoD = new Proceso("D", 6, 4, 6);
        Proceso procesoE = new Proceso("E", 14, 5, 5);
        ArrayList<Proceso> lista = new ArrayList<>();
        lista.add(procesoA);
        lista.add(procesoB);
        lista.add(procesoC);
        lista.add(procesoD);
        lista.add(procesoE);


        RAM memoria = new RAM();

        OrganizadorSO MVT = new OrganizadorSO(memoria, lista);

        while(true){
            MVT.pasoN();
            MVT.getRam().printMemory();
            MVT.getTablas().printTablas();

            Scanner scan = new Scanner(System.in);
            String h = scan.nextLine();
        }


        
    }
}
