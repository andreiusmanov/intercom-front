package uz.uat.intercom.model.documents;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Reference;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Message {

    @Id
    private String id;
    private String arangoId;
    private LocalDateTime created;
    @Reference(to = User.class)
    private User author;
    @Reference(to = Chat.class)
    private Chat chat;
    private String text;
    private List<File> files;

}
