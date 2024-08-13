package main.java.com.ohgiraffers.question;

public class User { //DTO 클래스

    private String id;
    private String name;
    private String pwd;
    private String pwdAgain;

    public User() {
    }

    public User(String id, String name, String pwd) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;

    }

    public User(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwdAgain() {
        return pwdAgain;
    }

    public void setPwdAgain(String pwdAgain) {
        this.pwdAgain = pwdAgain;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", pwdAgain='" + pwdAgain + '\'' +
                '}';
    }
}
