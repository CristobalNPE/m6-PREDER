package org.lht.m6preder.domain.repository;

import org.lht.m6preder.domain.dto.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {

  List<User> findAll();

  Optional<User> findById(Long userId);

  User save(User user);

  void delete(Long userId);

}
