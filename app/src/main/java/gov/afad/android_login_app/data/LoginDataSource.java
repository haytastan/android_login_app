package gov.afad.android_login_app.data;

import gov.afad.android_login_app.data.model.LoggedInUser;

import java.io.IOException;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {

    public Result<LoggedInUser> login(String username, String password) {

        try {
            // TODO: handle loggedInUser authentication xxx
            LoggedInUser fakeUser =
                    new LoggedInUser(
                            java.util.UUID.randomUUID().toString(),
                            "  Dr. Hayati TAŞTAN");
            return new Result.Success<>(fakeUser);
        } catch (Exception e) {
            return new Result.Error(new IOException("Giriş hatası: ", e));
        }
    }

    public void logout() {
        // TODO: revoke authentication
    }
}