package id.ac.poliban.mi.yusfan.listtari;

public class Dance {
    private String dance;
    private String danceName;
    private String danceDesc;

    public Dance(String dance, String danceName, String danceDesc) {
        this.dance = dance;
        this.danceName = danceName;
        this.danceDesc = danceDesc;
    }

    public String getDance() {
        return dance;
    }

    public void setDance(String dance) {
        this.dance = dance;
    }

    public String getDanceName() {
        return danceName;
    }

    public void setDanceName(String danceName) {
        this.danceName = danceName;
    }

    public String getDanceDesc() {
        return danceDesc;
    }

    public void setDanceDesc(String danceDesc) {
        this.danceDesc = danceDesc;
    }

    @Override
    public String toString() {
        return String.format("%30s\n\n%s", getDanceName(),getDanceDesc());
    }
}
