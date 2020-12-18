package com.demo.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Report;
import com.demo.repository.ReportRepository;
import com.demo.service.ReportService;

@Service
public class ReportServiceImpl implements ReportService{

	@Autowired
	private ReportRepository report_repository;
	@Override
	public Report addReport(Report report) {
		// TODO Auto-generated method stub
		return report_repository.save(report);
	}

	@Override
	public List<Report> getAllReports() {
		// TODO Auto-generated method stub
		return report_repository.findAll();
	}

	@Override
	public List<Report> getReportsByCategory(String category) {
		// TODO Auto-generated method stub
		return  report_repository.findByCategory(category);
	}

	@Override
	public List<Report> getReportsByDate(String date) {
		// TODO Auto-generated method stub
		return  report_repository.findByDate(date);
	}

}
