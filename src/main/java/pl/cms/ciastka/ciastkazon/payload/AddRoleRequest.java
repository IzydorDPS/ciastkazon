package pl.cms.ciastka.ciastkazon.payload;

import javax.validation.constraints.NotBlank;

public class AddRoleRequest {
    @NotBlank
    private String role;
    @NotBlank
    private String email;

    public String getRole() {
        return this.role;
    }

    public String getEmail() {
        return email;
    }
}
