package uz.uat.intercom.model.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Reference;

import lombok.Data;

@Data
public class Staff {
    @Id
    private String id;
    private String arangoId;
    private String title;
    @Reference(to = Department.class)
    private Department department;
}
