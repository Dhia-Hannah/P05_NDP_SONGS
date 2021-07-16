package sg.edu.rp.c346.id20031826.p05_ndp_songs;

public class songs {

    private 	int id;
    private 	String title;
    private     String singers;
    private     int year;

    public songs ( int id, String title, String singers, int year ) {
        this.id = id;
        this.title = title;
        this.singers = singers;
        this.year = year;
    }

    public songs ( String title, String singers, int year ) {
        this.title = title;
        this.singers = singers;
        this.year = year;
    }

    public int getId() {  return id;  }

    public String getTitle() { return title; }

    public String getSingers() { return singers; }

    public int getYear() { return year; }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSingers(String singers) {
        this.singers = singers;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() { return title + "\n" + singers + "\n" + year;  }
}
