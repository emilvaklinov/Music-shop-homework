public class Piano {

    private int key;
    private String type;
    private String sound;

    public Piano(int key, String type, String sound) {
        this.key = key;
        this.type = type;
        this.sound = sound;
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
