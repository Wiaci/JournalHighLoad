package educ.journal.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.cglib.core.GeneratorStrategy;

import javax.persistence.*;

@Entity
@Table(name = "grp")
@Data
@NoArgsConstructor
public class Group {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

}
