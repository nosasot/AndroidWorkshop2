package chawalit.chonpratatip.androidworkshop02.models;

import org.parceler.Parcel;

@Parcel
public class User {

    public String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
