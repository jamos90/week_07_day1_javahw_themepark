public class BeerTent extends Stall implements ISecurity {

    protected int ageLimit;

    public BeerTent(String name, String owner, int parkingSpot, int ageLimit){
        super(name,owner,parkingSpot);
        this.ageLimit = ageLimit;
    }

    public boolean isOldEnough(Visitor visitor){
        if (visitor.getAge() >= this.ageLimit){
            return true;
        }
        return false;
    }


    @Override
    public boolean isAllowedTo(Visitor guest) {
        if (isOldEnough(guest)) {
            return false;
        }
        return true;
    }
}
