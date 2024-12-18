import java.util.ArrayList;

public class Author {

    private String name;
    private ArrayList<Title> titles;

    public Author(String name){
        this.name = name;
        this.titles = new ArrayList<>();
    }

    public Author() {
    }

    public void addTitle(Title title) {
        titles.add(title);
    }

    public float calculateTotalPay() {
    float totalPay = 0;
    for(Title t : titles){
        totalPay += t.calculateRoyalty();
    }
    return totalPay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Title> getTitles() {
        return titles;
    }

    public void setTitles(ArrayList<Title> titles) {
        this.titles = new ArrayList<>(titles);
    }
}


