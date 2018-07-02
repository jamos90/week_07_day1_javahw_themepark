public class Park extends Attraction implements ISecurity {

    protected int ageLimit;

    public Park(String name, int ageLimit){
        super(name);
        this.ageLimit = ageLimit;
    }

    @Override
    public boolean isAllowedTo(Visitor guest) {
         if (guest.age < this.ageLimit){
             return false;
         } return true;

    }
}
