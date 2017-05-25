package com.team1.lms.sales;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.team1.admin.dao.AdministrationDAO;

@WebServlet("/hb/applicant_delete.hb")
public class ApplicantDelete extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		String id = (String) req.getParameter("id");
		AdministrationDAO dao = new AdministrationDAO();
		int result = 0;
		
		try {
			result = dao.deleteStudent(id);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		if(result > 0) {
			resp.sendRedirect("applicant_management.hb");
		}
		
	}
		
}
