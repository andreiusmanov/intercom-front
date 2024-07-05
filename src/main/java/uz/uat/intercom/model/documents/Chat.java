package uz.uat.intercom.model.documents;

import java.time.LocalDateTime;
import java.util.Set;

import org.springframework.data.annotation.Reference;

import lombok.AllArgsConstructor;
import lombok.Data;
import uz.uat.intercom.model.ChatTypes;

@Data
@AllArgsConstructor
public class Chat {
    private String id;
    private String arangoId;
    private ChatTypes chatType;
    private String name;
    @Reference(to = User.class)
    private Set<User> users;
    @Reference(to = User.class)
    private Set<User> administrators;
    private LocalDateTime created;
    private boolean privateChat;

}