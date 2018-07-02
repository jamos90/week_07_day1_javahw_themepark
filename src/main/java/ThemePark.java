import java.util.ArrayList;

public class ThemePark {
    protected ArrayList<IReviewed> reviewed;

    public ThemePark(){
        this.reviewed = new ArrayList<>();
    }

    public int reviewedCount(){
        return reviewed.size();
    }


    public void addReviewed(IReviewed object) {
        this.reviewed.add(object);
    }

    public void clear(){
        this.reviewed.clear();
    }

    public ArrayList<IReviewed> reviewList(){
        ArrayList<IReviewed> review_list= new ArrayList<>();
        for (IReviewed reviews : this.reviewed){
            review_list.add(reviews);
        }
        return review_list;
    }
}
