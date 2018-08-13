public class Piano extends Instrument{

    private int key;

    public Piano( String type, String sound, int key) {
        super(sound, type);
        this.key = key;
    }

    public int getKey(){
        return key;
    }

    public String getType(){
        return type;
    }


    @Override
    public String play() {
        return null;
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
