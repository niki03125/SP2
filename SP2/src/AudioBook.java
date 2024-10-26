public class AudioBook extends Title{

    int durationInMinutes;

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes){
        super(title, literatureType, copies);
        this.durationInMinutes= durationInMinutes;

    }
// getter
    public int getDurationInMinutes() {
        return durationInMinutes;
    }

//setter
    public void setdurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    protected double calculatePoints(){

    }
    @Override
    protected double calculateLiteraturePoints(){

    }



}
