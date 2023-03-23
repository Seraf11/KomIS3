package start;

import java.io.Serializable;

public class Report implements Serializable{

    private static final long serialVersionUID = 1L;

    private int id_report;
    private String pathmaster;
    private int brigade;
    private String railwayname;
    private String sitename;
    private String datereport;
    private String textreport;
    public Report(int id_report, String pathmaster, int brigade, String railwayname, String sitename, String datereport, String textreport){

        this.id_report = id_report;
        this.pathmaster = pathmaster;
        this.brigade = brigade;
        this.railwayname = railwayname;
        this.sitename = sitename;
        this.datereport = datereport;
        this.textreport = textreport;
    }
    public int getId_report() {
        return id_report;
    }

    public String getPathmaster() {
        return pathmaster;
    }

    public void setPathmaster(String pathmaster) {
        this.pathmaster = pathmaster;
    }

    public int getBrigade() {return brigade;}

    public void setBrigade(int brigade) {
        this.brigade = brigade;
    }

    public String getRailwayname() {
        return railwayname;
    }

    public void setRailwayname(String railwayname) {
        this.railwayname = railwayname;
    }

    public String getSitename() {
        return sitename;
    }

    public void setSitename(String sitename) {
        this.sitename = sitename;
    }

    public String getDatereport() {
        return datereport;
    }

    public void setDatereport(String datereport) { this.datereport = datereport; }

    public String getTextreport() {
        return textreport;
    }

    public void setTextreport(String textreport) {
        this.textreport = textreport;
    }
}

