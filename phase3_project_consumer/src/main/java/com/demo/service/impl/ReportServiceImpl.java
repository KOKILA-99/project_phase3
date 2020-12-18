package com.demo.service.impl;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.demo.model.Report;
import com.demo.service.ReportService;

@Service
public class ReportServiceImpl implements ReportService {
	
	private String url="http://localhost:9100/report/";
	private String urlReports="http://localhost:9100/reports/";

	private RestTemplate restTemplate=new RestTemplate();
	@Override
	public Report addReport(Report report) {
		// TODO Auto-generated method stub
		return restTemplate.postForObject(url, report, Report.class);
	}

	@Override
	public List<Report> getAllReports() {
		// TODO Auto-generated method stub
		ResponseEntity<List<Report>> response=restTemplate.exchange(urlReports, 
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<List<Report>>() {
		});
		return response.getBody();
	}

	@Override
	public List<Report> getReportsByCategory(String category) {
		// TODO Auto-generated method stub
		ResponseEntity<List<Report>> response=restTemplate.exchange(url+category, 
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<List<Report>>() {
		});
		return response.getBody();
	}

	@Override
	public List<Report> getReportsByDate(String date) {
		// TODO Auto-generated method stub
		ResponseEntity<List<Report>> response=restTemplate.exchange(urlReports+date, 
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<List<Report>>() {
		});
		return response.getBody();
	}

}
