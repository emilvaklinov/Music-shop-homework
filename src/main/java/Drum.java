public class Drum {
    private String type;
    private int batons;
    private String sound;

    public Drum(String type, int batons, String sound){
        this.type = type;
        this.batons = batons;
        this.sound = sound;

    }

    public String getType(){
        return type;
    }

    public int getBatons(){
        return batons;
    }

    public String canPlay(){
        return sound;
    }
}
