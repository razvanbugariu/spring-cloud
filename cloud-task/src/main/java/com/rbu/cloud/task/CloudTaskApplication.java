package com.rbu.cloud.task;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class CloudTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudTaskApplication.class, args);
	}

	@Bean
	public TollProcessingTask tollProcessingTask() {
		return new TollProcessingTask();
	}

	public class TollProcessingTask implements CommandLineRunner {

		@Override
		public void run(String... strings) throws Exception {
			//params: stationId, licencePlate, timestamp
			if(null != strings) {
				System.out.println("Parameter length is" + strings.length);
				String stationId = strings[0];
				String licencePlate = strings[1];
				String timestamp = strings[2];
				System.out.println(stationId + " " + licencePlate + " " + timestamp);
			}
		}
	}

}
