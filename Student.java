package com.maheshalladi;

public class Student {

    private String id;
    private String name;
    private String emailId;
    private int age;
    private Character grade;

    // Getter and Setter methods
    public String getId() {return id; }
    public void setId(String id) {this.id = id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getEmailId() {return emailId;}
    public void setEmailId(String emailId) {this.emailId = emailId;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public Character getGrade() {return grade;}
    public void setGrade(Character grade) {this.grade = grade;}

    // Default Constructor
    public Student(){
        super();
    }
    // Parameterized Constructor
    public Student(String id, String name, String emailId, int age,
                   Character grade) {
        super();
        this.id = id;
        this.name = name;
        this.emailId = emailId;
        this.age = age;
        this.grade = grade;
    }
}
