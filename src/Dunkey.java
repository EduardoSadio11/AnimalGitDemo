public class Dunkey implements Animal{
    private static final String WOOF = "Ohn!";
    private String name;

    public Dunkey(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String speak() {
        return Dunkey.WOOF;
    }
}
