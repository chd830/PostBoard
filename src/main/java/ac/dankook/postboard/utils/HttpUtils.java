package ac.dankook.postboard.utils;

import ac.dankook.postboard.constants.HttpConstants;
import ac.dankook.postboard.data.Post;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.*;

public class HttpUtils {

    public static boolean existsUserNo(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies)
                if (HttpConstants.COOKIE_NAME.equals(cookie.getName()))
                    return true;
        }
        return false;
    }

    public static String getUserNoFromCookie(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies)
                if (HttpConstants.COOKIE_NAME.equals(cookie.getName()))
                    return cookie.getValue();
        }
        return null;
    }

    public static Cookie setCookie(String userNo) {
        Cookie cookie = new Cookie(HttpConstants.COOKIE_NAME, userNo);
        cookie.setMaxAge(60 * 60 * 1);
        cookie.setPath("/");
        return cookie;
    }

    public static Cookie deleteCookieByCookieName(HttpServletRequest request) {
        Cookie cookie = new Cookie("cookie", null);
        cookie.setMaxAge(0);
        return cookie;
    }

}
