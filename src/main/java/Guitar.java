public class Guitar {

    private int strings;
    private String type;
    private String sound;

    public Guitar(int strings, String type, String sound) {
        this.strings = strings;
        this.type = type;
        this.sound = sound;
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
