package student;

import human.Human;

public class Student extends Human {
    private int age;
    private String name;
    private String Edu;
    private String AofI;
    private String aim;

    public Student(int age, String name, String Edu, String AofI, String aim) {
        this.age = age;
        this.aim = aim;
        this.AofI = AofI;
        this.Edu = Edu;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEdu() {
        return Edu;
    }

    public String getAofI() {
        return AofI;
    }

    public void setAofI(String AofI) {
        this.AofI = AofI;
    }

    public String getAim() {
        return aim;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
