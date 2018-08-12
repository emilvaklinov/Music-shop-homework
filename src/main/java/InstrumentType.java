public enum InstrumentType {
    STRING("String"),
    KEYBOARD("Keyboard"),
    BRASS("Brass"),
    LEATHER("Leather");

    private String category;

    InstrumentType(String category){
        this.category = category;
    }
    public String getString(){
        return category;
}

}
