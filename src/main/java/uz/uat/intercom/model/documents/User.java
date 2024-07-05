package uz.uat.intercom.model.documents;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class User {
    @Id
    private String id;
    private String arangoId;
    private String name;
    private String surname;
    private String patronymic;
    private String tabel;
}
