public enum Month {
    JANUARY(30),FEBRUARY(28),MARCH(31),APRIL(31),MAY(30),JUNE(30),JULE(31),AUGOUST(31),SEPTEMBER(30),OCTOBER(31),NOVEMBER(30),DECEMBER(32);
    private final int value;
    Month(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
