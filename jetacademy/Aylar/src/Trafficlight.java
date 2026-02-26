public enum Trafficlight {
    RED("Kec"),GREEN("Dayan"),YELLOW("Dayanmaga hazirlas");
    private String value;
    Trafficlight(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
