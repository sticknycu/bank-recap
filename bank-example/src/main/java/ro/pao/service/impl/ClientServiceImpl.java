package ro.pao.service.impl;

import lombok.Getter;
import lombok.NoArgsConstructor;
import ro.pao.model.Client;
import ro.pao.service.ClientService;
import ro.pao.service.MailService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@NoArgsConstructor
@Getter
public class ClientServiceImpl implements ClientService {

    private static List<Client> clientList = new ArrayList<>();

    @Override
    public Optional<Client> getById(UUID id) {
        return clientList.stream()
                .filter(object -> id.equals(object.getId()))
                .findFirst();
    }

    @Override
    public Optional<Client> getBySomeFieldOfClass(Object someFieldFromExampleClass) {
        return Optional.empty();
    }

    @Override
    public List<Client> getAllFromList() {
        return clientList;
    }

    @Override
    public void addAllFromGivenList(List<Client> mailList) {
        mailList.addAll(mailList);
    }

    @Override
    public void addOnlyOne(Client client) {
        clientList.add(client);
    }

    @Override
    public void removeElementById(UUID id) {
        clientList = clientList.stream()
                .filter(object -> !id.equals(object.getId()))
                .collect(Collectors.toList());
    }

    @Override
    public void modificaElementById(UUID id, Client newElement) {
        removeElementById(id);
        addOnlyOne(newElement);
    }
}
