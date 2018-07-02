public class Rollarcoaster extends Attraction implements ISecurity {

    protected int ageLimit;
    protected int minimunHeight;

    public Rollarcoaster(String name, int ageLimit, int minimunHeight){
        super(name);
        this.ageLimit = ageLimit;
        this.minimunHeight = minimunHeight;
    }

    public boolean isTallEnough(Visitor visitor) {
        if (visitor.getHeight() >= minimunHeight) {
            return true;
        }
        return false;
    }

    public boolean isOldEnough(Visitor visitor){
        if (visitor.getAge() >= this.ageLimit){
            return true;
        }
        return false;
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (isOldEnough(visitor) && isTallEnough(visitor)) {
            return true;
        }
        return false;
    }

    public int getMinAge() {
        return this.ageLimit;
    }
}
