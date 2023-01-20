package com.BatchProcessing.scheduling;

import java.text.SimpleDateFormat;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.scheduling.annotation.Scheduled;

import org.springframework.stereotype.Component;

@Component
public class scheduler {
	@Autowired
	private JobLauncher jobLauncher;

	@Autowired
	private Job job;

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

//	@Scheduled(fixedRate = 5000)
//	public void simpleFixedRate() {
//		
//	        System.out.println("This Task Performed at: " + dateFormat.format(new Date()));
//		
////	}
//	@Scheduled( initialDelay = 3000,fixedDelay = 5000)
//	   public void simpleFixedDelay() {
//		System.out.println("This Task Performed at: " + dateFormat.format(new Date()));
//	   }

//		@Scheduled(cron = "0/15" + " * * * * *")
//		public void simpleCronExpression() {
//
//			System.out.println("This Task Performed at: " + dateFormat.format(new Date()));
//		}
//	

	@Scheduled(cron = "0/30" + " * * * * *")
	public void scheduleImportToDB() {

		JobParameters jobParameters = new JobParametersBuilder().addLong("startAt", System.currentTimeMillis())
				.toJobParameters();
		try {
			jobLauncher.run(job, jobParameters);
		} catch (JobExecutionAlreadyRunningException | JobRestartException | JobInstanceAlreadyCompleteException
				| JobParametersInvalidException e) {
			e.printStackTrace();
		}

	}
}
