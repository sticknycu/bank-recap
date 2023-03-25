package ro.pao.model;

import lombok.*;
import ro.pao.model.abstracts.AbstractEntity;
import ro.pao.model.enums.ClientType;

import java.time.LocalDateTime;
import java.util.List;

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

    private List<MailInformation> mailList;

    private ClientType clientType;
}
