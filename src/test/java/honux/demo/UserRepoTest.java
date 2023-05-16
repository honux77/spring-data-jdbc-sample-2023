package honux.demo;


import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;

@DataJdbcTest
@Slf4j
public class UserRepoTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    @DisplayName("UserRepo에서 사용자 1번을 읽어와야 한다.")
    void findById() {
        User user = userRepository.findById(1L).orElseThrow();
        log.info("user = {}", user);
    }
}
