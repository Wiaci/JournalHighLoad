package educ.journal.service;

import educ.journal.entity.User;

import java.util.List;

public interface UserService {

    User register(User user);

    List<User> getAll();

    User findById(Long id);

    User findByUsername(String name);

    void delete(Long id);

}
