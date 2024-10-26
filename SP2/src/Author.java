import java.util.ArrayList;

public class Author {

    private String name;
    private ArrayList<Title> titles;

    public Author(String name){
        this.name = name;
        this.titles = new ArrayList<>();
    }

    public void addTitle(Title title){
        titles.add(title);
    }

    public float calculateTotalPay(){

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public ArrayList<Title> getTitles(){
        return titles;
    }

    public ArrayList<Title> setTitles(ArrayList<Title> titles){
        this.titles = new ArrayList<>(titles);
    }


}
