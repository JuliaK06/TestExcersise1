package bg.smg;

public abstract class Clothes {

    private String fabric;

    public Clothes() {
        this.fabric = "";
    }
    public Clothes(String fabric) {
        this.fabric = fabric;
    }

    public abstract void sell();

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }
}
