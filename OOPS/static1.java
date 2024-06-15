//all static area allowed once in memory whereas object will allow
//again and again
//use to save memory
// cannot be access by class name
    class Student {
        static String school;
        String name;   
     }
     
     
     public class static1{
        public static void main(String args[]) {
            Student.school = "JMV";
            Student s1 = new Student();
            Student s3 = new Student();
     
     
            s1.name = "Meena";
            s3.name = "Beena";
     
     
            System.out.println(s1.school);
            System.out.println(s3.school);
        }
     }
     

