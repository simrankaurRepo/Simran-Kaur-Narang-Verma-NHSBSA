
Feature: To test NHS Job Search functionality
  As a jobseeker on NHS Jobs Website I should be able search as per my job preferences and get recently posted jobs. 
  
   	Scenario Outline: To test job seeker able to search jobs by location preference
    
    Given I am a jobseeker on NHS Jobs website
		When I put my "<Location>" location preference into the Search functionality
		Then I should get a list of jobs which matches my "<Location>" preference
		And sort my search results with the newest Date Posted
		
		Examples:
		|Location|
		|London|
		|Brimingham|
		|England|
		|EC4A|
		
		Scenario Outline: To test job seeker able to search jobs by job title / skills preference
		
		Given I am a jobseeker on NHS Jobs website
		When I put my "<Job Title / Skills>" job title or skills preference into the Search functionality
		Then I should get a list of jobs which matches my "<Job Title / Skills>" preference
		And sort my search results with the newest Date Posted
		
		Examples:
		|Job Title / Skills|
		|Finance|
		|JAVA|
		|Software Tester|
		
		Scenario Outline: To test job seeker able to search jobs by job reference preference
		
		Given I am a jobseeker on NHS Jobs website
		When I put my "<Job Reference>" job reference preference into the Search functionality
		Then I should get a list of jobs which matches my "<Job Reference>" preference
		And sort my search results with the newest Date Posted
		
		Examples:
		|Job Reference|
		|259-7226231GSS-A|
	
		
		
		Scenario Outline: To test job seeker able to search jobs by Employer preference
		
		Given I am a jobseeker on NHS Jobs website
		When I put my "<Employer>" Employer preference into the Search functionality
		Then I should get a list of jobs which matches my "<Employer>" preference
		And sort my search results with the newest Date Posted
		
		Examples:
		|Employer|
		|NHS Business Services Authority|
	
		
		Scenario Outline: To test job seeker able to search jobs by pay range preference
		
		Given I am a jobseeker on NHS Jobs website
		When I put my "<Pay Range>" pay range preference into the Search functionality
		Then I should get a list of jobs which matches my "<Pay Range>" preference
		And sort my search results with the newest Date Posted
		
		Examples:
		|Pay Range|
		|£10,000 to £20,000|
		
		
		
		Scenario Outline: To test job seeker able to search jobs by job title, location and Pay range preferences
		
		Given I am a jobseeker on NHS Jobs website
		When I put my Pay range, location and job title preferences into the Search functionality
		|<Job Title / Skills>|
		|<Location>		|
	  |<Pay Range>|
		Then I should get a list of jobs which matches my "<Job Title / Skills>", "<Location>" and "<Pay Range>" preferences
		And sort my search results with the newest Date Posted
		Examples:
		|Job Title / Skills	|Location	|Pay Range					|
		|Software Tester	 	|London		|£10,000 to £20,000 |
		
		
# We can add more scenarios of search functionality

#1. with different combination of below fields for functionality coverage -

#Job Title / Skills
#Location / PostCode
#Distance
#Job Reference 
#Employer
#PayRange
	    
#2.Then cover negative cases to check proper messages are displaying if no search result
#3. For "Refine your search"  