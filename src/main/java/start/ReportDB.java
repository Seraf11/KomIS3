package start;

import java.sql.*;
import java.util.ArrayList;

public class ReportDB {
    private static final String url = "jdbc:postgresql://localhost:5432/pathMaster";
    private static final String username = "postgres";
    private static final String password = "12345";

    public static ArrayList<Report> select() {

        ArrayList<Report> reports = new ArrayList<>();
        try{
            Class.forName("org.postgresql.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){

                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM report");
                ResultSet resultSet = stmt.executeQuery();
                while(resultSet.next()){

                    int id_report = resultSet.getInt(1);
                    String pathmaster = resultSet.getString(2);
                    int brigade = resultSet.getInt(3);
                    String railwayname = resultSet.getString(4);
                    String sitename = resultSet.getString(5);
                    String datereport = resultSet.getString(6);
                    String textreport = resultSet.getString(7);

                    Report report = new Report(id_report, pathmaster, brigade, railwayname, sitename, datereport, textreport);
                    reports.add(report);
                }
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return reports;
    }

    public static Report selectOne(int id) {

        Report report = null;
        try{
            Class.forName("org.postgresql.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){

                String sql = "SELECT * FROM report WHERE id_report=?";
                try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
                    preparedStatement.setInt(1, id);
                    ResultSet resultSet = preparedStatement.executeQuery();
                    if(resultSet.next()){
                        int id_report = resultSet.getInt(1);
                        String pathmaster = resultSet.getString(2);
                        int brigade = resultSet.getInt(3);
                        String railwayname = resultSet.getString(4);
                        String sitename = resultSet.getString(5);
                        String datereport = resultSet.getString(6);
                        String textreport = resultSet.getString(7);

                        report = new Report(id_report, pathmaster, brigade, railwayname, sitename, datereport, textreport);
                    }
                }
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return report;
    }

    public static void insert(Report report) {
        try{
            Class.forName("org.postgresql.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){

                String sql = "INSERT INTO report (pathmaster, brigade, railwayname, sitename, datereport, textreport) Values (?, ?, ?, ?, ?, ?)";
                try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
                    preparedStatement.setString(1, report.getPathmaster());
                    preparedStatement.setInt(2, report.getBrigade());
                    preparedStatement.setString(3, report.getRailwayname());
                    preparedStatement.setString(4, report.getSitename());
                    preparedStatement.setString(5, report.getDatereport());
                    preparedStatement.setString(6, report.getTextreport());

                    preparedStatement.executeUpdate();
                }
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }

    }

    public static void update(Report report) {

        try{
            Class.forName("org.postgresql.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){

                String sql = "UPDATE report SET pathmaster = ?, brigade = ?, railwayname = ?, sitename = ?, datereport = ?, textreport = ? WHERE id_report = ?";
                try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
                    preparedStatement.setString(1, report.getPathmaster());
                    preparedStatement.setInt(2, report.getBrigade());
                    preparedStatement.setString(3, report.getRailwayname());
                    preparedStatement.setString(4, report.getSitename());
                    preparedStatement.setString(5, report.getDatereport());
                    preparedStatement.setString(6, report.getTextreport());
                    preparedStatement.setInt(7, report.getId_report());

                    preparedStatement.executeUpdate();
                }
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    public static void delete(int id_report) {

        try{
            Class.forName("org.postgresql.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){

                String sql = "DELETE FROM report WHERE id_report = ?";
                try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
                    preparedStatement.setInt(1, id_report);

                    preparedStatement.executeUpdate();
                }
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }

}


