package pl.cms.ciastka.ciastkazon.Exceptions;

public class UsernameAlreadyExists extends Throwable {
    public UsernameAlreadyExists(String username) {
        super(username);
    }
}
