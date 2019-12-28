package pl.cms.ciastka.ciastkazon.payload;

import javax.validation.constraints.NotBlank;

public class AddRoleRequest {
    @NotBlank
    private String role;

    public String getRole() {
        return this.role;
    }
}
