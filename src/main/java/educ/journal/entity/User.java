package educ.journal.entity;

import educ.journal.enums.Activity;
import educ.journal.enums.Role;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "usr")
@Data
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    //private String login;
    private String firstname;
    private String lastname;
    private String password;

    @Column(name = "last_password_reset_date")
    private Date lastPasswordResetDate;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Enumerated(EnumType.STRING)
    private Activity activity;

}
