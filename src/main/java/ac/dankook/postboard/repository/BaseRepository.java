package ac.dankook.postboard.repository;

import java.util.List;

/**
 * @param <T>  DB Domain에 맞는 Data Object
 * @param <PK> Data Object의 Priamry Key
 * @author YoonJiSoo
 */
public interface BaseRepository<T, PK> {
    T insert(T entity);
    T selectOne(PK pk);
    List<T> selectList(Object criteria);
    int update(T entity);
    int delete(PK entity);
}
