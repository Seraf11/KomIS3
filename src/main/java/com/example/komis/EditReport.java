package com.example.komis;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import start.Report;
import start.ReportDB;

@WebServlet("/edit")
public class EditReport extends HttpServlet {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            int id_report = Integer.parseInt(request.getParameter("id_report"));
            Report report = ReportDB.selectOne(id_report);
            System.out.println(report);
            if(report!=null) {
                request.setAttribute("report", report);
                getServletContext().getRequestDispatcher("/edit.jsp").forward(request, response);
            }
            else {
                getServletContext().getRequestDispatcher("/notfound.jsp").forward(request, response);
            }
        }
        catch(Exception ex) {
            getServletContext().getRequestDispatcher("/notfound.jsp").forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            int id_report = Integer.parseInt(request.getParameter("id_report"));
            String pathmaster = request.getParameter("pathmaster");
            int brigade = Integer.parseInt(request.getParameter("brigade"));
            String railwayname = request.getParameter("railwayname");
            String sitename = request.getParameter("sitename");
            String datereport = (request.getParameter("datereport"));
            String textreport = request.getParameter("textreport");
            Report report = new Report(id_report, pathmaster, brigade, railwayname, sitename, datereport, textreport);
            ReportDB.update(report);
            response.sendRedirect(request.getContextPath() + "/index");
        }
        catch(Exception ex) {

            getServletContext().getRequestDispatcher("/notfound.jsp").forward(request, response);
        }
    }
}
