package educ.journal.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.cglib.core.GeneratorStrategy;

import javax.persistence.*;

@Entity
@Table(name = "grp")
@Getter
@Setter
@NoArgsConstructor
public class Group {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

}
