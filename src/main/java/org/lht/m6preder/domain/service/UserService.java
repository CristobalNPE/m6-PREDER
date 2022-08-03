package org.lht.m6preder.domain.service;

import org.lht.m6preder.domain.dto.User;
import org.lht.m6preder.domain.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

  private final UserRepository repo;

  public UserService(UserRepository repo) {
    this.repo = repo;
  }

  public List<User> findAll() {
    return repo.findAll();
  }

  public Optional<User> findById(Long userId) {
    return repo.findById(userId);
  }

  public User save(User user) {
    return repo.save(user);
  }

  public boolean delete(Long userId) {
    return findById(userId)
            .map(user -> {
              repo.delete(userId);
              return true;
            }).orElse(false);
  }
}
