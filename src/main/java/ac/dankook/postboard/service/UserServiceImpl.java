package ac.dankook.postboard.service;

import ac.dankook.postboard.data.User;
import ac.dankook.postboard.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private static Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    UserRepository userRepository;


    public void setSignUpData(User user) {
        userRepository.insert(user);
    }

    public int getUserNo(String userId) {
        if (null != userRepository.getUserNo(userId))
            return userRepository.getUserNo(userId).getUserNo();
        return 0;
    }

    public String getUserPassword(User user) {
        return userRepository.getPassword(user).getUserPw();
    }

    public boolean checkPassword(User user) {
        String userPw = user.getUserPw();
        String checkPw = this.getUserPassword(user);
        LOGGER.debug("input password: " + userPw);
        LOGGER.debug(checkPw);

        if (checkPw.equals(userPw)) {
            LOGGER.debug("true");
            return true;
        }
        LOGGER.debug("false");
        return false;
    }

    public String getUserName(String userNo) {
        User user = userRepository.getUserName(userNo);
        if (user != null) return user.getUserName();
        return null;
    }
}
