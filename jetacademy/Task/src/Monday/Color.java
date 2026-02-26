package Monday;

public enum Color {
    RED("qirmizi"),
    BLUE("goy"),
    YELLOW("sari");
    private String color;
    Color(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
}
