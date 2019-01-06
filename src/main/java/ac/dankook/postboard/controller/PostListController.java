package ac.dankook.postboard.controller;

import ac.dankook.postboard.data.Post;
import ac.dankook.postboard.service.PostService;
import ac.dankook.postboard.utils.HttpUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class PostListController {
    private static final Logger LOGGER = LoggerFactory.getLogger(PostListController.class);
    @Autowired
    PostService postService;

    public List<Post> getList(HttpServletRequest request) {
        List<Post> list = new ArrayList<>();
        list = postService.getPostNameByUserNo(HttpUtils.getUserNoFromCookie(request));
        if (!list.isEmpty()) return list;
        else return null;
    }

    public boolean nextPage(HttpServletRequest request) {
        int postCount = postService.getPostListNumber(HttpUtils.getUserNoFromCookie(request));
        if(postCount > 10) {
            return true;
        }
        else {
            return false;
        }

    }
}
