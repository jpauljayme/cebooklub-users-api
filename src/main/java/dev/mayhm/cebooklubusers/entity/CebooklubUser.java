package dev.mayhm.cebooklubusers.entity;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("tbl_users")
public class CebooklubUser {

    int id;

    @Column("fld_name")
    private String name;

    @Column("fld_email")
    private String email;

    @Column("fld_username")
    private String username;

    @Column("fld_password")
    private String password;

    @Column("fld_role")
    private String role;

    public CebooklubUser(String name, String email, String username, String password,
                         String role) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        CebooklubUser that = (CebooklubUser) o;

        return new EqualsBuilder().append(id, that.id).append(name, that.name).append(email, that.email).append(username, that.username).append(password, that.password).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(name).append(email).append(username).append(password).toHashCode();
    }
}
