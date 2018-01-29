package br.com.access.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.access.models.ApplicationUser;

public interface UserRepository extends CrudRepository<ApplicationUser, Long>{
	 ApplicationUser findByUsername(String username);
}
