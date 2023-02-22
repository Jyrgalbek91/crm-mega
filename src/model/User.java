package model;

public abstract class User extends BaseEntity{
    private String name;
    private String surname;
    private String phone;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return  "\n" + "Имя: " + name + "\n" +
                "Фамилия: " + surname + "\n" +
                "Телефон: " + phone + "\n" +
                "емайл: " + email  + "\n" +
                "Дата создания: " + getDateCreated();
    }
}
