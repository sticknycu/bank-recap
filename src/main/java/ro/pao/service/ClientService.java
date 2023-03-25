package ro.pao.service;

import ro.pao.model.Client;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ClientService {

    Optional<Client> getById(UUID id);

    Optional<Client> getBySomeFieldOfClass(Object someFieldFromExampleClass);

    List<Client> getAllFromList();

    void addAllFromGivenList(List<Client> accountList);

    void addOnlyOne(Client account);

    void removeElementById(UUID id);

    void modificaElementById(UUID id, Client newElement);
}

