package ac.dankook.postboard.controller;

import ac.dankook.postboard.data.Post;
import ac.dankook.postboard.service.PostService;
import ac.dankook.postboard.service.UserService;
import ac.dankook.postboard.utils.HttpUtils;
import ac.dankook.postboard.utils.SearchVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class PostListRestController {

    @Autowired
    PostService postService;
    @Autowired
    UserService userService;

    @RequestMapping(value = "rest/postlist")
    public String getList(SearchVO param, HttpServletRequest request) {
        String userNo = HttpUtils.getUserNoFromCookie(request);
        int count = postService.getListCountNumber(userNo);

        if (count != 0) {
            int page = param.getPageIndex();
            if(page == 1) {
                param.setFirstIndex(1);
                param.setLastIndex(15);
            } else {
                param.setFirstIndex(page+(14*(page-1)));
                param.setLastIndex(page*15);
            }
            List<Post> list = postService.getPostByUserNo(userNo);
        }
        return "";
    }

}
