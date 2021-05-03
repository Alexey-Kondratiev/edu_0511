public abstract class Animal {

    String speak;
    byte legs;
    
    public Animal(String speak,byte legs) {
        this.speak=speak;
        this.legs=legs;
    }
    
    String getSpeak() {return this.speak;}
    byte getLegs() {return  this.legs;}
}
