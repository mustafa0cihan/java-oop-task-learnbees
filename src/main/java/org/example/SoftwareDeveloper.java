package org.example;

public class SoftwareDeveloper extends Employee implements ISoftwareDeveloper {
    // A Manager has Supervisor, skills, experience attribute additionally.
    // Please implement necessary methods to get and set these attributes of Manager
    private Manager supervisor;
    private String skills;
    private int experience;

    public SoftwareDeveloper(int Id, String FirstName, String LastName, int Age, double Salary, String Department,
            Manager Supervisor, String Skills, int Experience) {
        super(Id, FirstName, LastName, Age, Salary, Department);
        this.supervisor = Supervisor;
        this.skills = Skills;
        this.experience = Experience;
    }

    public void setSupervisor(Manager supervisor) {
        this.supervisor = supervisor;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Manager getSupervisor() {
        return supervisor;
    }

    public String getSkills() {
        return skills;
    }

    public int getExperience() {
        return experience;
    }
}