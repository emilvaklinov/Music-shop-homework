public class Piano extends Instrument{

    private int key;

    public Piano( String type, String sound, int key) {
        super(sound);
        super(type);
        this.key = key;
    }

    public int getKey(){
        return key;
    }

    public String getType(){
        return type;
    }

    public String canPlay(){
        return sound;
    }

    }
