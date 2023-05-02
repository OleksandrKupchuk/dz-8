public class Student {
    private int id;
    private String name;
    private String surName;

    public Student(int id, String name, String surname){
        this.id = id;
        this.name = name;
        this.surName = surname;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getSurName(){
        return surName;
    }
}