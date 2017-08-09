package de.gedoplan.springbootdemo.repository;

import de.gedoplan.springbootdemo.entity.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "msg", collectionResourceRel = "msg")
public interface MessageRepository extends CrudRepository<Message, Integer> {

}
