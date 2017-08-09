package de.gedoplan.springbootdemo.repository;

import de.gedoplan.springbootdemo.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "usr", collectionResourceRel = "usr")
public interface UserRepository extends CrudRepository<User, Integer> {

}
