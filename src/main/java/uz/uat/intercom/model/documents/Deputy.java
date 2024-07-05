package uz.uat.intercom.model.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Reference;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * class for users that serve as secretaries. write messages? make calls,
 * exchange files
 * on behalf of master to colleagues.
 * messages/records/files are visible to master straight away as if he wrote the
 * message
 * himself/herself
 */
@Data
@AllArgsConstructor
public class Deputy {
    @Id
    private String id;
    private String arangoId;
    @Reference(to = User.class)
    private User deputy;
    @Reference(to = User.class)
    private User master;
    private boolean blind;
    private boolean active;
}
