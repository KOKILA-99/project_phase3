package com.demo.service;

import java.util.Date;
import java.util.List;

import com.demo.model.Report;

public interface ReportService {

	public Report addReport(Report  report);
	public List<Report> getAllReports();
	public List<Report> getReportsByCategory(String category);
	public List<Report> getReportsByDate(String date);
}
