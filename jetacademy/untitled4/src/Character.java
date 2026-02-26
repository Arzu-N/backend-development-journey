public class Character {
    private String name;
    private int health;
    static int totalCharacters=0;
    Character(String name, int health) {
        this.name = name;
        this.health = health;
        totalCharacters++;
    }
    final void displayHealth(){
        System.out.println(health);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
