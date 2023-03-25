package ro.pao.model;

import lombok.*;
import ro.pao.model.abstracts.AbstractEntity;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class MailInformation extends AbstractEntity {

    private String firstName;

    private String lastName;

    private String signature;

    private final Predicate<String> mailCondition = (mail) -> mail.contains("@yahoo") && mail.contains("@gmail");
    private final BiPredicate<String, String> fullNameCondition = (firstName, lastName) -> firstName.equals(this.firstName) && lastName.equals(this.lastName);

    public MailInformation(String mail) {
        if (!mailCondition.test(mail)) {
            System.out.println("Imi pare rau, nu ai respectat cerinta mail-ului.");
        }

        var mailSplit = mail.split("@")[0]; // [0] = "prenume.nume" , [1] = "yahoo.com" / "gmail.com"
        var fullNameSplit = mailSplit.split(".");

        if (!fullNameCondition.test(fullNameSplit[0], fullNameSplit[1])) {
            System.out.println("Imi pare rau, nu ai respectat cerinta mail-ului.");
        }

        this.firstName = fullNameSplit[0];
        this.lastName = fullNameSplit[1];
        this.signature = mail.split("@")[1];
    }

    public MailInformation(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
