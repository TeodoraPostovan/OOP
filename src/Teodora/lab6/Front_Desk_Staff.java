package Teodora.lab6;

import javax.naming.Name;
import java.util.Date;

public class Front_Desk_Staff extends Administrative_Staff {

    public Front_Desk_Staff(Hospital[] hospital1, String title, String givenName, String middleName, String familyName, FullName persname, Date birthDate, Gender gender, Address homeAdrress, Phone phone, Date joined, String education, String certification, String languages) {
        super(hospital1, title, givenName, middleName, familyName, persname, birthDate, gender, homeAdrress, phone, joined, education, certification, languages);
    }
}
