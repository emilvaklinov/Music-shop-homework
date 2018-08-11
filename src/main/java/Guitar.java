public class Guitar extends Instrument{

    private int strings;

    public Guitar(int strings, String type, String sound) {
        super(type);
        super(sound);
        this.strings = strings;
    }

    public int getStrings(){
        return strings;
    }

    public String getType(){
        return type;
    }



    public String play(){
        return sound;
    }





}
