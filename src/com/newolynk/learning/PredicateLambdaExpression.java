package com.newolynk.learning;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateLambdaExpression {

	public static void main(String[] args) {
		
		PredicateLambdaExpression lambdaExpression = new PredicateLambdaExpression();
		
		List<String> listJobs = Arrays.asList("Accountant", "Actor", "Athlete", 
				                             "Brain Scientist", "Coach", "Computer software developer",
				                             "Dancer", "Database administrator", "Dentist", "Farmer", "FBI Agent");
		
		//Get all the jobs starting with A
		System.out.println("List of jobs starts with letter A ");
		lambdaExpression.getSpecialJob(listJobs,  job -> ((String) job).startsWith("A"));
		
		//Get all the jobs starting with D
		System.out.println("List of jobs starts with letter D ");
		lambdaExpression.getSpecialJob(listJobs,  job -> ((String) job).startsWith("D"));
		
		//Get all the jobs ends with R
		System.out.println("List of jobs ends with letter R ");
		lambdaExpression.getSpecialJob(listJobs,  job -> ((String) job).toUpperCase().endsWith("R"));
		
		//Get all the jobs without providing criteria
		System.out.println("Get all the jobs without exception ");
		lambdaExpression.getSpecialJob(listJobs, p -> true);
	
	}
	
	private void getSpecialJob(List<String> listJobs, Predicate jobCriteria) {
		for (String job: listJobs) {
			if (jobCriteria.test(job)) {
				System.out.println(job + " ");
			}
		}
	}

}
