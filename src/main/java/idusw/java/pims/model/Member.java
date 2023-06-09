package idusw.java.pims.model;

import java.util.Objects;

public class Member {
    // 실제 업무에서 사용되는 Data 들을 구현한 객체, Domain 객체, DTO(Data Transfer Object)
    private Long id;
    private String email;
    private String name;
    private String pw;
    private String phone;
    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) { // 동일성, 동등성 비교
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return email.equals(member.email) && pw.equals(member.pw);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email);
    }
}
