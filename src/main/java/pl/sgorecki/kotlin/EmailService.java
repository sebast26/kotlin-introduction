package pl.sgorecki.kotlin;

import org.jetbrains.annotations.Nullable;

public class EmailService {

    String getEmailOrNull(@Nullable final Client client) {
        if (client == null) {
            return null;
        }

        if (client.getPersonalInfo() == null) {
            return null;
        }
        return client.getPersonalInfo().getEmail();
    }

}
