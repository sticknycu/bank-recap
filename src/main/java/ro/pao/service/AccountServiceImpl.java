package ro.pao.service;

import lombok.Getter;
import lombok.NoArgsConstructor;
import ro.pao.model.Account;
import ro.pao.service.AccountService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Aici implementam metodele din interfata serviciului definit.
 */
@NoArgsConstructor
@Getter
public final class AccountServiceImpl implements AccountService {

    /**
     * Atentie sa fie static. Daca nu o sa fie static, fiecare instanta va avea propria ei lista si astfel vor aparea probleme la apelarea metodelor.
     * Se poate inlocui si cu un Map<UUID, ExampleClass> exampleClassHashMap = new HashMap<>();
     * Si astfel veti avea o performanta la operatii.
     *
     * Puteti folosi diverse structuri de date in functie de nevoi, tinand cont de complexitate.
     */
    private static List<Account> accountList = new ArrayList<>();
    // private static Map<UUID, ExampleClass> exampleClassHashMap = new HashMap<>();

    @Override
    public Optional<Account> getById(UUID id) {

        /*for (var account : accountList) {
            if (account.getId() == id) {
                return Optional.of(account);
            } else {
                return Optional.empty();
            }
        }*/

        return accountList.stream()
                .filter(account -> account.getId().equals(id))
                .findAny();

    }

    @Override
    public Optional<Account> getBySomeFieldOfClass(Object someFieldFromExampleClass) {
        return Optional.empty();
    }

    @Override
    public List<Account> getAllFromList() {
        return accountList;
    }

    @Override
    public void addAllFromGivenList(List<Account> accountList) {
        accountList.addAll(accountList);
    }

    @Override
    public void addOnlyOne(Account account) {
        accountList.add(account);
    }

    @Override
    public void removeElementById(UUID id) {
        accountList = accountList.stream()
                .filter(element -> !id.equals(element.getId())) // filtrez elementele astfel incat elementul cautat sa nu fie id-ul dat
                // astfel, o sa avem o lista care nu contine elementul dat
                .collect(Collectors.toList()); // daca folosim .toList() se va crea o lista imutabila.
                // .collect(Collectors.toList()) face o lista mutabila
    }

    @Override
    public void modificaElementById(UUID id, Account newElement) {
        // sterg elementul dat si adaug altul
        removeElementById(id);
        addOnlyOne(newElement);
    }
}
