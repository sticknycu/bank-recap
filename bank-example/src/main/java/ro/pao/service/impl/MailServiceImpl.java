package ro.pao.service.impl;

import ro.pao.model.MailInformation;
import ro.pao.service.MailService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

public class MailServiceImpl implements MailService {

    private static List<MailInformation> mailInformationList = new ArrayList<>();

    @Override
    public Optional<MailInformation> getById(MailInformation id) {
        return mailInformationList.stream()
                .filter(obj -> id.equals(obj.getId()))
                .findAny();
    }

    @Override
    public Optional<MailInformation> getBySomeFieldOfClass(Object someFieldFromExampleClass) {
        return Optional.empty();
    }

    @Override
    public List<MailInformation> getAllFromList() {
        return mailInformationList;
    }

    @Override
    public void addAllFromGivenList(List<MailInformation> mailList) {
        mailInformationList.addAll(mailList);
    }

    @Override
    public void addOnlyOne(MailInformation mail) {
        mailInformationList.add(mail);
    }

    @Override
    public void removeElementById(UUID id) {
        mailInformationList = mailInformationList.stream()
                .filter(obj -> !id.equals(obj.getId()))
                .collect(Collectors.toList());
    }

    @Override
    public void modificaElementById(UUID id, MailInformation newElement) {
        removeElementById(id);
        addOnlyOne(newElement);
    }
}
