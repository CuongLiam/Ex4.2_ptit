public class Main {
    public static void main(String[] args) {
        Student[] studentArr = new Student[]{
                new Student("S001", "Josh", true),
                new Student("S002", "Mia", false),
                new Student("S003", "Lily", false)
        };

        for (int i = 0; i < studentArr.length; i++){
            System.out.println(studentArr[i]); //sout một obj nên nó sẽ gọi toString của Java
                                                // nhưng mình đã override và bắt nó sử dụng toString của mình bên dưới
                                                // để cho mình dễ đọc
        }


        System.out.println(Student.getNumberOfStudents());
    }
}

class Student{
    String id;
    String name;
    boolean gender;
    static int numberOfStudents = 0;

    Student(){

        numberOfStudents++;
    }
    Student(String id, String name, boolean gender){
        this.id = id;
        this.name = name;
        this.gender = gender;
        numberOfStudents++;
    }

    String getId(){
        return id;
    }
    String getName(){
        return name;
    }
    boolean isGender(){
        return gender;
    }
    static int getNumberOfStudents(){
        return numberOfStudents;
    }

    @Override
    public String toString(){
        return "Student[id=" + id
                + ", name="  + name
                + ", gender=" + (gender ? "nam" : "nu") + "]";
    }
}