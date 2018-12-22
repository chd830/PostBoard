package ac.dankook.postboard.utils;

import ac.dankook.postboard.constants.HttpConstants;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

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
}
