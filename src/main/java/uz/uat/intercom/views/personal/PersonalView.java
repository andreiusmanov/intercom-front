package uz.uat.intercom.views.personal;

import com.vaadin.flow.router.Route;

import uz.uat.intercom.model.documents.Staff;
import uz.uat.intercom.model.documents.User;

@Route(value = "/personal")
public class PersonalView {

    private User user;
    private Staff staff;

}
