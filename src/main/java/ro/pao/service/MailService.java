package ro.pao.service;

import ro.pao.model.Client;
import ro.pao.model.MailInformation;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface MailService {

    Optional<MailInformation> getById(MailInformation id);

    Optional<MailInformation> getBySomeFieldOfClass(Object someFieldFromExampleClass);

    List<MailInformation> getAllFromList();

    void addAllFromGivenList(List<MailInformation> mailList);

    void addOnlyOne(MailInformation mail);

    void removeElementById(UUID id);

    void modificaElementById(UUID id, MailInformation newElement);
}