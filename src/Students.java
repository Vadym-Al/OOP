public class Students {
    /**
     * Frst params
     */
    private byte ID_studenta;
    private String Fam;
    private String Name;
    private String Groupa;
    private String Department;
    private String discipline;
    private byte mark;
    private String NameTeacher;
    /**
     * Constructor
     */
    public Students() {
        this.ID_studenta=1;
        this.Fam="Petrov";
        this.Name="Vlad";
        this.Groupa="3G";
        this.Department="121 programrng";
        this.discipline="OOP";
    }
    /**
     * geters
     */

    public byte getID_studenta() {
        return ID_studenta;
    }

    public String getFam() {
        return Fam;
    }

    public String getName() {
        return Name;
    }

    public String getGroupa() {
        return Groupa;
    }

    public String getDepartment() {
        return Department;
    }

    public String getDiscipline() {
        return discipline;
    }

    public byte getMark() {
        return mark;
    }

    public String getNameTeacher() {
        return NameTeacher;
    }
    /**
     * Setters
     */

    public void setID_studenta(byte ID_studenta) {
        this.ID_studenta = ID_studenta;
    }

    public void setFam(String fam) {
        Fam = fam;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setGroupa(String groupa) {
        Groupa = groupa;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public void setMark(byte mark) {
        this.mark = mark;
    }

    public void setNameTeacher(String nameTeacher) {
        NameTeacher = nameTeacher;
    }
    /**
     * method toString
     * @return
     */

    @Override
    public String toString() {
        return "Students{" +
                "ID_studenta=" + ID_studenta +
                ", Fam='" + Fam + '\'' +
                ", Name='" + Name + '\'' +
                ", Groupa='" + Groupa + '\'' +
                ", Department='" + Department + '\'' +
                ", discipline='" + discipline + '\'' +
                ", mark=" + mark +
                ", NameTeacher='" + NameTeacher + '\'' +
                '}';
    }
}