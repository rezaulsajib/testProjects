package api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import api.entity.Project;
import api.repository.ProjectRepository;
import api.services.ProjectService;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);
	
	@Autowired
	private ProjectService service;


	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	@Bean
	public CommandLineRunner demo(ProjectRepository repository) {
		return (args) -> {
			service.save(new Project("Spring", "Spring-Boot"));
			service.save(new Project("Spring", "Spring-JDBC"));
			log.info("Saved Projects are:-");
			log.info("-------------------------------");
			for (Project project : repository.findAll()) {
				log.info(project.toString());
			}
		};
	}

}