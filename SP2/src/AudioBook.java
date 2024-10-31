public class AudioBook extends Title {

    private int durationInMinutes;

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes) {
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }

    //setter
    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

   protected double calculatePoints(){
        return (durationInMinutes * 0.5) * calculateLiteraturePoints() * copies;
    }

    protected double calculateLiteraturePoints(){
        double pointsPerMinute;
        switch (this.getliteratureType()) {
            case "BI":
            case "TE":
                pointsPerMinute = 1.5;
                break;
            case "Lyrik":
                pointsPerMinute = 3;
                break;
            case "SKØN":
                pointsPerMinute = .85;
                break;
            case "FAG":
                pointsPerMinute = .5;
                break;
            default:
                pointsPerMinute = 0;
        }

        return pointsPerMinute;
    }
}
