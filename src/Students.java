public class Students extends Universal {
    private String groupa;
    private String department;
    private String discipline;
    private byte mark;
    private String nameTeacher;

    public Students(int ID, String name, String lastname, String groupa, String department, String discipline, byte mark, String nameTeacher) {
        this.ID=ID;
        this.name=name;
        this.lastName=lastname;
        this.groupa=groupa;
        this.department=department;
        this.discipline=discipline;
        this.mark=mark;
        this.nameTeacher=nameTeacher;
    }
    public Students(){
        this(0,"john","Marget","3G","OOP","121", (byte) 5,"Maslow");
    }

    @Override
    public int getID() {
        return super.getID();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    public String getGroupa() {
        return groupa;
    }

    public String getDepartment() {
        return department;
    }

    public String getDiscipline() {
        return discipline;
    }

    public byte getMark() {
        return mark;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    @Override
    public void setID(int ID) {
        super.setID(ID);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    public void setGroupa(String groupa) {
        this.groupa = groupa;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public void setMark(byte mark) {
        this.mark = mark;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    @Override
    public String toString() {
        return "Students{"+super.toString()+", groupa='" + groupa + '\''+", department='" + department + '\''+", discipline='" + discipline + '\''+", mark='" + mark + '\''+", nameTeacher='" + nameTeacher + '\''+'}';
    }
}