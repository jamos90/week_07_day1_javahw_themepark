public abstract class Stall implements IReviewed {
    protected String name;
    protected String owner;
    protected int parkingSpot;
    protected int rating;

    public Stall(String name, String owner, int parkingSpot, int rating){
        this.name = name;
        this.owner = owner;
        this.parkingSpot = parkingSpot;
        this.rating = rating;
    }


    public String getName() {
        return this.name;
    }

    public String getOwner() {
        return this.owner;
    }

    public int getParkingSpot() {
        return this.parkingSpot;
    }

    public int getRating() {
        return this.rating;
    }
}
