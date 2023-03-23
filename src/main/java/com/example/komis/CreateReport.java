package com.example.komis;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import start.Report;
import start.ReportDB;

@WebServlet("/create")
public class CreateReport extends HttpServlet {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/create.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            String pathmaster = request.getParameter("pathmaster");
            int brigade = Integer.parseInt(request.getParameter("brigade"));
            String railwayname = request.getParameter("railwayname");
            String sitename = request.getParameter("sitename");
            String datereport = request.getParameter("datereport");
            String textreport = request.getParameter("textreport");
            Report report = new Report(brigade, pathmaster, brigade, railwayname, sitename, datereport, textreport);
            ReportDB.insert(report);
            response.sendRedirect(request.getContextPath()+"/index");
        }
        catch(Exception ex) {

            getServletContext().getRequestDispatcher("/create.jsp").forward(request, response);
        }
    }
}

