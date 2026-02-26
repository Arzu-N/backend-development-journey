public enum Weekday {
    MONDAY("Ish gunudur"),
    TUESDAY("Ish gunudur"),
    WEDNESDAY("Ish gunudur"),THURSDAY("Ish gunudur"),
    FRIDAY("Ish gunudur"),
    SATURDAY("qeyri is gunu"),SUNDAY("qeyri is gunu");
    private final String value;


    Weekday(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
