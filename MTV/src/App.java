public class App {
    public static void main(String[] args) throws Exception {
        
        Proceso procesoA = new Proceso("A", 8, 1, 7);
        Proceso procesoB = new Proceso("B", 14, 2, 7);
        Proceso procesoC = new Proceso("C", 18, 3, 4);
        Proceso procesoD = new Proceso("D", 6, 4, 6);
        Proceso procesoE = new Proceso("E", 14, 5, 5);


        RAM memoria = new RAM();

        memoria.addProceso(procesoA.getNombre(), procesoA.);
    }
}
