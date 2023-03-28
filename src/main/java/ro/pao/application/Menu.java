package ro.pao.application;

import ro.pao.model.Account;
import ro.pao.model.Client;
import ro.pao.model.enums.AccountType;
import ro.pao.service.AccountService;
import ro.pao.service.ClientService;
import ro.pao.service.impl.AccountServiceImpl;
import ro.pao.service.impl.ClientServiceImpl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

/**
 * In Meniu se fac operatiile care pot lua informatii din toate dintre servicile definite.
 * De exemplu, avem definit mai jos `private final ExampleService exampleService = new ExampleServiceImpl();`
 *
 * In cazul in care aveam definit mai multe servicii, la fel, faceam o initializare a serviciile si astfel apelam metode din serviciu.
 */
public class Menu {

    private static Menu INSTANCE;

    private final AccountService accountService = new AccountServiceImpl();
    private final ClientService clientService = new ClientServiceImpl();

    public static Menu getInstance() {
        return (INSTANCE == null ? new Menu() : INSTANCE);
    }

    private Menu() {}

    public void intro() {
        String intro = """
                Intro example
                """;

        System.out.println(intro);




















        /** EXEMPLE:
        Account account = Account.builder()
                .id(UUID.randomUUID())
                .creationDate(LocalDate.now()) // data de azi
                .alias("cont economii")
                .accountType(AccountType.NONE)
                .balance(BigDecimal.valueOf(1000))
                .build();

        Client client = Client.builder()
              //  .clientType(ClientType.PERSONAL)
               // .mailList(List.of(new MailInformation("example1", "example2"), new MailInformation("example3", "example4")))
                .firstName("Gigel")
                .lastName("Florin")
                .birthLocation("Bucuresti")
                .build();

        accountService.addOnlyOne(account);

        clientService.addOnlyOne(client);


        List<Account> exampleServiceList = List.of(
                Account.builder()
                        .id(UUID.randomUUID())
                        .creationDate(LocalDate.of(2023, 03, 22))
                       // .updateDate(LocalDate.now())
                        .build(),
                Account.builder()
                        .id(UUID.randomUUID())
                        .creationDate(LocalDate.of(2023, 03, 22))
                       // .updateDate(LocalDate.now())
                        .build()
        );

        accountService.addAllFromGivenList(exampleServiceList);

        System.out.println("Inainte de stergere: ");
        accountService.getAllFromList()
                .forEach(elementFromList -> System.out.println(elementFromList));


        System.out.println("Dupa modificare: ");
     //   account.setUpdateDate(LocalDate.of(2, 2, 2));
        accountService.modificaElementById(account.getId(), account);
        accountService.getAllFromList()
                .forEach(elementFromList -> System.out.println(elementFromList));

        System.out.println("Dupa stergere: ");
        accountService.removeElementById(account.getId());
        accountService.getAllFromList()
                .forEach(elementFromList -> System.out.println(elementFromList));

         */
    }
}
