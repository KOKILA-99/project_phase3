package com.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Report;
import com.demo.service.ReportService;

@RestController
public class ReportController {

	@Autowired
	private ReportService service;
	@PostMapping("/report")
	public Report addReport(@RequestBody Report report) {
		// TODO Auto-generated method stub
		return service.addReport(report);
	}

	@GetMapping("/reports")
	public List<Report> getAllReports() {
		// TODO Auto-generated method stub
		return service.getAllReports();
	}

	@GetMapping("/report/{category}")
	public List<Report> getReportsByCategory(@PathVariable String category) {
		// TODO Auto-generated method stub
		return service.getReportsByCategory(category);
	}
	@GetMapping("/reports/{date}")
	public List<Report> getReportsByDate(@PathVariable String date) {
		// TODO Auto-generated method stub
		return service.getReportsByDate(date);
	}
}
