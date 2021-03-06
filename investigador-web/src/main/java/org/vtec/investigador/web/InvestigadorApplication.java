package org.vtec.investigador.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.vtec.investigador.core.config.InvestigadorProfiles;

@SpringBootApplication(scanBasePackages = "org.vtec")
@EntityScan(basePackages = "org.vtec")
public class InvestigadorApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(InvestigadorApplication.class);
		application.setAdditionalProfiles(InvestigadorProfiles.DEV.getProfileName());
		application.run(args);
	}
}
