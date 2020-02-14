package com.jfk;


import com.jfk.entity.User;
import com.jfk.repository.UserRepository;
import com.jfk.valueobject.UserCreateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author William Arustamyan
 */

@Service
public class UserService {


    private UserRepository userRepository;

    public User create(UserCreateRequest request) {
        User user = new User();
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        user.setUserName(request.getUserName());

        return userRepository.save(user);
    }

    public User find(String userName) {
        User found = userRepository.findByUserName(userName);
        if (found != null) {
            return found;
        }
        throw new UserNotFoundException(String.format("user with username : %s not found...", userName));
    }

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}



















