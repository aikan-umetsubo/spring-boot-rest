package com.example.restapp.model;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapp.repository.UserRepository;

@RestController
public class UserController {

  UserRepository repository;

	@GetMapping("/user")
	public User get(
    @RequestParam(value = "id") int id
  ) {
    User user = repository.findById(id);
    return user;
	}

  @PostMapping("/user")
  public User post(
    @RequestParam(value = "name") String name,
    @RequestParam(value = "address") String address
  ) {
    User user = new User(name, address);
    repository.save(user);
    return user;
  }

  @PatchMapping("/user")
  public User patch(
    @RequestParam(value = "id") long id,
    @RequestParam(value = "name") String name,
    @RequestParam(value = "id") String address
  ) {
    return new User("", "");
  }

  @DeleteMapping("/user")
  public void delete(
    @RequestParam(value = "id") long id
  ) {
    repository.deleteById(id);
  }
}
