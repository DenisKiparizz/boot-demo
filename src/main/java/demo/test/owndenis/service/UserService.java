package demo.test.owndenis.service;

import demo.test.owndenis.entity.User;

import java.util.List;

public interface UserService {

    User findById(Long id);

    List<User> getAllUsers();

    boolean saveUser(User user);

    void deleteUser(Long id);
}
