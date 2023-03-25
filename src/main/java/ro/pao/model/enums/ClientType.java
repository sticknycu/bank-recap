package ro.pao.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum ClientType {
    PERSONAL("Personal"),
    BUSINESS("Business"),
    NONE("none"); // in cazul in care nu este niciun field

    private final String typeString;

    public static ClientType getEnumByFieldString(String field) {
        return Arrays.stream(ClientType.values())
                .filter(enumElement -> enumElement.typeString.equals(field))
                .findAny()
                .orElse(NONE); // in cazul in care nu este niciun field
    }
}
