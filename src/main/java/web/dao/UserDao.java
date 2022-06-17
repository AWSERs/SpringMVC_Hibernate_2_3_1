package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    List<User> getListUsers();
    void add(User user);
    void delete(int id);
    void update(User user, int id);
    User getById(int id);

}
