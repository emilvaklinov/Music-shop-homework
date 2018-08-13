package accessories;

public abstract class Accessory implements ISell {

    private InstrumentType category;
    private double priceBuy;
    private double priceSold;

    public Accessory(InstrumentType category, double priceBuy){
        this.category = category;
        this.priceBuy = priceBuy;
        this.priceSold = priceBuy + CalculateMarkup();
    }

    public double getPriceBuy(){
        return priceBuy;
    }

    public double getPriceSold(){
        return priceSold;
    }
}
