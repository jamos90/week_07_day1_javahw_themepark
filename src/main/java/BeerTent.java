public class BeerTent extends Stall implements ISecurity {

    protected int ageLimit;

    public BeerTent(String name, String owner, int parkingSpot, int ageLimit){
        super(name,owner,parkingSpot);
        this.ageLimit = ageLimit;
    }

    @Override
    public boolean isAllowedTo(Visitor guest) {
        if ( guest.age < this.ageLimit) {
            return false;
        }
        return true;
    }
}
