package ac.dankook.postboard.repository;

import ac.dankook.postboard.data.Post;
import ac.dankook.postboard.data.User;

import java.util.List;

public interface PostRepository extends BaseRepository<Post, Integer> {
    List<String> getTitle(User user);
    List<String> getContent(User user);

    List<Post> selectListByUserNo(String userNo);

    List<Post> selectMainPostByUserNo(String userNo);

    List<Post> selectMainPostByUserId(String userId);
}
