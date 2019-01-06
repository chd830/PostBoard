package ac.dankook.postboard.repository;

import ac.dankook.postboard.data.Post;

import java.util.List;

public interface PostRepository extends BaseRepository<Post, Integer> {
    List<Post> selectPostListByUserNo(String userNo);
    int selectPostListNumber(String userNo);
}
