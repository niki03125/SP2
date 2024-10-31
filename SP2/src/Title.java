public abstract class Title extends Author{

    private String title;
    private String literatureType;
    protected int copies;
    protected double rate = 0.067574;

    public Title(String title, String literatureType, int copies){
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;
    }

//gettere

    public String getTitle() {
        return title;
    }
    public String getliteratureType() {
        return literatureType;
    }
    public int getcopies() {
        return copies;
    }
    public double getrate() {
        return rate;
    }

//Settere
    public void setTitle(String title) {
    this.title = title;
    }
    public void setliteratureType(String literatureType) {
        this.literatureType = literatureType;
    }
    public void setcopies(int copies) {
        this.copies = copies;
    }
    public void setrate(double rate) {
        this.rate = rate;
    }

    public double calculateRoyalty(){
        return calculatePoints() * rate;
    }

    protected abstract double calculatePoints();

    protected abstract double calculateLiteraturePoints();


}
