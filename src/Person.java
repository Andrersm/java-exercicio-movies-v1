public abstract class Person {
    private String name;
    private int age;

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

    @Override
    public String toString() {
        return
                "+---------------------------------+\n" +
                        "|                                 |\n" +
                        "|  Person{                         |\n" +
                        "|    name='" + name + "'           |\n" +
                        "|    age=" + age + "               |\n" +
                        "|  }                              |\n" +
                        "|                                 |\n" +
                        "+---------------------------------+";
    }
}
