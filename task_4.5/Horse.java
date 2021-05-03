public class Horse extends Animal {
    public Horse(String speak,byte legs) {
        super (speak,legs);
    }
    
    public void run() {
        System.out.println(speak+", я поскакал(а)");
    }    
}
