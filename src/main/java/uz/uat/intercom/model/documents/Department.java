package uz.uat.intercom.model.documents;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Department {
    private String id;
    private String arangoId;
    private String name;
    private String code;
    private boolean status;
}
