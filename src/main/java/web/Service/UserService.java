package web.Service;

import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAll();
    public User getOne(Long id);
    public void add(User user);
    public void delete(User user);
    public void update(Long id, User user);
}
