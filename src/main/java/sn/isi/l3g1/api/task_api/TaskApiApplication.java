package sn.isi.l3g1.api.task_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"sn.isi.l3g1"})
@EntityScan(basePackages = {"sn.isi.l3g1.api.model", "sn.isi.l3g1.core"})
@EnableJpaRepositories(basePackages = {"sn.isi.l3g1.api.repository", "sn.isi.l3g1.core.repository"})
public class TaskApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(TaskApiApplication.class, args);
    }
}