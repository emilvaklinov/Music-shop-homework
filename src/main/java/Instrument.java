public abstract class Instrument {

    String type;
    String sound;

    public Instrument(String type, String sound){
        this.type = type;
        this.sound = sound;
    }

    public String getType(){
        return this.type;
    }

    public String getSound(){
        return this.sound;
    }

}
