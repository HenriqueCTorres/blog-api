package br.com.fiap.javaadv.blog.backend;

import br.com.fiap.javaadv.blog.backend.domainmodel.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collection;
import java.util.LinkedList;
import java.util.UUID;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);


		Collection<User> users = new LinkedList<User>();

		users.add(new User(UUID.randomUUID(), "sample name", "sample_e mail", "S3kr3t", null, null, null));
		users.add(new User(UUID.randomUUID(), "sample name", "sample_e mail", "S3kr3t", null, null, null));
		users.add(new User(UUID.randomUUID(), "sample name", "sample_e mail", "S3kr3t", null, null, null));
		users.add(new User(UUID.randomUUID(), "sample name", "sample_e mail", "S3kr3t", null, null, null));
		users.add(new User(UUID.randomUUID(), "sample name", "sample_e mail", "S3kr3t", null, null, null));
		users.add(new User(UUID.randomUUID(), "sample name", "sample_e mail", "S3kr3t", null, null, null));
		users.add(new User(UUID.randomUUID(), "sample name", "sample_e mail", "S3kr3t", null, null, null));
		users.add(new User(UUID.randomUUID(), "sample name", "sample_e mail", "S3kr3t", null, null, null));
		users.add(new User(UUID.randomUUID(), "sample name", "sample_e mail", "S3kr3t", null, null, null));
		users.add(new User(UUID.randomUUID(), "sample name", "sample_e mail", "S3kr3t", null, null, null));

		for( User user : users){
			System.out.println(user);
		}

	}

}
