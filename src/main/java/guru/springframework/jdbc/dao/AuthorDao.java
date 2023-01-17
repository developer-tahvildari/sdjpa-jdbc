package guru.springframework.jdbc.dao;

import guru.springframework.jdbc.domain.Author;

/**
 * Created by Abdolrahim Tahvildari on 1/17/2023
 */
public interface AuthorDao {
    Author getById(Long id);
}
