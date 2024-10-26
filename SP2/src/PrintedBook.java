public class PrintedBook extends Title{

    private int pages;

    public PrintedBook(String title, String literatureType, int copies, int pages) {
        super(title, literatureType, copies);
    }

// getter
    public int getPageses() {
        return pages;
    }

//setter
    public void setPages(int pages) {
    this.pages = pages;
    }

    @Override
    protected double calculatePoints(){

    }

    @Override
    protected double calculateLiteraturePoints(){

    }

}
