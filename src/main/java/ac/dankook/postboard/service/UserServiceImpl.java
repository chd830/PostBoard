package ac.dankook.postboard.service;

import ac.dankook.postboard.data.User;
import ac.dankook.postboard.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    private static Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    public void setSignUpData(User user) {
        userRepository.setUserData(user);
    }
    public User getUserPassword(User user) {
        return userRepository.getUserPassword(user);
    }
    public Boolean checkPassword(User user) {
        String userPw = user.getUserPw();
        String checkPw = this.getUserPassword(user).getUserPw();
        LOGGER.debug(userPw);
        LOGGER.debug(checkPw);

        if(checkPw.equals(userPw)) {
            LOGGER.debug("true");
            return true;
        }
        else {
            LOGGER.debug("false");
            return false;
        }
    }
}
