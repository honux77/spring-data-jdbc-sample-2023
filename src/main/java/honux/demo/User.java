package honux.demo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceCreator;

import java.time.LocalDateTime;

@ToString
public class User {

    @Id
    private Long Id;
    private String name;
    private LocalDateTime createdDate;

}
