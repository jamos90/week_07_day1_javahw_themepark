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
}
