import java.util.Date;

enum Sex {
    F,
    M
}

public class Profile {
    String name;
    Date birthday;
    Sex sex;

    public Profile(String name, Date birthday, Sex sex) {
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Enum getSex() {
        return sex;
    }

}
