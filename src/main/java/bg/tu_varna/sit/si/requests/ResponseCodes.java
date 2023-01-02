package bg.tu_varna.sit.si.requests;

public class ResponseCodes {

    public enum ResponseCodeTypes {

        SUCCESS,
        INTERNAL_ERROR,
        USER_WITH_THIS_EMAIL_ALREADY_EXISTS("User with this email already exists."),
        USER_WITH_THIS_PHONE_NUMBER_ALREADY_EXISTS("User with this phone number already exists.");

        public final String description;

        ResponseCodeTypes() {
            this.description = "";
        }

        ResponseCodeTypes(String description) {
            this.description = description;
        }
    }
}
