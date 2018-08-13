public class Bagpipe extends Instrument {
    private int chanter;

    public Bagpipe(String type, String sound, int chanter) {
        super(type, sound);
        this.chanter = chanter;
    }

    public String getType(){
        return type;
}

    public int getChanter(){
        return chanter;
    }

    public String play(){
        return sound;
    }

    @Override
    public double calculateMarkup() {
        return 0;
    }

    @Override
    public InstrumentType getCategory() {
        return null;
    }
}
