public class Park extends Attraction implements ISecurity {

    protected int ageLimit;

    public Park(String name, int rating, int ageLimit){
        super(name, rating);
        this.ageLimit = ageLimit;
    }

    @Override
    public boolean isAllowedTo(Visitor guest) {
         if (guest.age < this.ageLimit){
             return false;
         } return true;

    }
}
