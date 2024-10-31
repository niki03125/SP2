public class PrintedBook extends Title{

    private int pages;

    public PrintedBook(String title, String literatureType, int copies, int pages) {
        super(title, literatureType, copies);
        this.pages=pages;
    }

// getter
    public int getPageses() {
        return pages;
    }

//setter
    public void setPages(int pages) {
    this.pages = pages;
    }

    protected double calculatePoints(){
        return  pages * calculateLiteraturePoints() * copies ;
    }

    protected double calculateLiteraturePoints(){
        double pointsPerSide;
        switch (this.getliteratureType()) {
            case "BI":
            case "TE":
                pointsPerSide = 3;
                break;
            case "Lyrik":
                pointsPerSide = 6;
                break;
            case "SKØN":
                pointsPerSide = 1.7;
                break;
            case "FAG":
                pointsPerSide = 1;
                break;
            default:
                pointsPerSide = 0;
        }
        return pointsPerSide;
    }

}
