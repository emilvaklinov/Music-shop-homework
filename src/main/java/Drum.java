public class Drum extends Instrument{

    private int batons;


    public Drum(String type, String sound, int batons) {
        super(type, sound);
        this.batons = batons;
    }

    public String getType(){
        return type;
    }

    public int getBatons(){
        return batons;
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
