package ac.dankook.postboard.service;

import ac.dankook.postboard.data.LogIn;
import ac.dankook.postboard.data.User;
import ac.dankook.postboard.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    public static Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    public void setSignUpData(User user) {
        userRepository.setUserData(user);
    }
    public LogIn getUserPassword(LogIn login) {
        LogIn user = userRepository.getUserPassword(login.getUserId());;
        return user;
    }
    public Boolean checkPassword(LogIn login) {
        String userPw = login.getUserPw();
        String checkPw = this.getUserPassword(login).getUserPw();
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
