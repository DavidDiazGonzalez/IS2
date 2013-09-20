package kata1;

import java.util.Date;


public class Student {

    

    private String name;
    private Date birthDate;
    
    public Student(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    
    
}
