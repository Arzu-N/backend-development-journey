public enum Color {
RED("qirmizi"),GREEN("yashil"),BLUE("goy");
private final String  value;
private Color(String value) {
this.value = value;
}
public String getValue() {
return value;
}
}
