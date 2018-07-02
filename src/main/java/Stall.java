public abstract class Stall {
    protected String name;
    protected String owner;
    protected int parkingSpot;

    public Stall(String name, String owner, int parkingSpot){
        this.name = name;
        this.owner = owner;
        this.parkingSpot = parkingSpot;
    }


    public String getName() {
        return this.name;
    }
}
