package de.gedoplan.springbootdemo.resource;

import de.gedoplan.springbootdemo.entity.Hello;
import de.gedoplan.springbootdemo.repository.UserRepository;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldResource {

  @RequestMapping(method = RequestMethod.GET)
  public ResponseEntity<Resource> greeting() {
    Hello h = new Hello();
    h.setMessage("Hello World");

    Link link = new Link("http://localhost:8080/demolink");
    Link user1Link = ControllerLinkBuilder.linkTo(UserRepository.class).slash("1").withRel("user1");

    Resource<Hello> resource = new Resource<>(h, link, user1Link);
    return new ResponseEntity<>(resource, HttpStatus.OK);
  }
}
