package com.rest.SpringBootAWS;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/api")
@Component
public class RestControllerExample {
	/*@GetMapping("/aws")
	public ResponseEntity Display(){
		return new ResponseEntity("I was landed on AWS cloud",HttpStatus.ACCEPTED);
		
	}*/
	
	
	static int i=0;
	@Scheduled(fixedRate=1000)
	public void displayTask(){
		System.out.println("sending message= "+i);
		i++;
	}
		//static int j=2;
		@Scheduled(cron="*/10 * * * * *")
		public void displayTask1(){
			System.out.println("sending cron message=");
			i++;
	}

	
}
