package guru.springframework.jdbc.dao;

import guru.springframework.jdbc.domain.Author;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Abdolrahim Tahvildari on 1/17/2023
 */
@ActiveProfiles("local")
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ComponentScan(basePackages = {"guru/springframework/jdbc/dao"})
class AuthorDaoIntegrationTest {

    @Autowired
    AuthorDao authorDao;

    @Test
    void getById() {
        Author author = authorDao.getById(1L);

        assertThat(author).isNotNull();
    }
}