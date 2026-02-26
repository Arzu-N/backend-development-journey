public enum Currency {
    AZN("Azerbaijan"),EUR("European"),DOLLAR("British");
    private final String value;
    Currency(String value){
      this.value=value;
    }
    public String getValue(){
        return this.value;
    }
  /*  @Override
    public String toString(){
        return AZN.name()+" "+this.value;
    }*/
}
