public class Bagpipe {
    private String type;
    private int chanter;
    private String sound;

    public  Bagpipe(String type, int chanter, String sound) {
        this.type = type;
        this.chanter = chanter;
        this.sound = sound;
    }
    public String getType(){
        return type;
}

    public int getChanter(){
        return chanter;
    }

    public String canPlay(){
        return sound;
    }
}
