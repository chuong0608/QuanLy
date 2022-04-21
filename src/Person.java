public class Person  {
    private String name;
    private int age;
    private String job;
    private int soCMND;

    public Person(String name, int age, String job, int soCMND) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.soCMND = soCMND;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(int soCMND) {
        this.soCMND = soCMND;
    }
}
