package ro.pao.model;

import lombok.*;
import ro.pao.model.abstracts.AbstractEntity;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
public class Client extends AbstractEntity {

    private String firstName;

    private String lastName;

    private String birthLocation;

    private LocalDateTime birthInformation;

    private String mail;
}
