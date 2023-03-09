public class Main {
    public static void main(String args[]) {
        //contoh 1
       Employee employee = new Employee();
       employee.name = "Bagus";
       employee.age = 30;
       employee.salary = 5000;
       employee.introduce();
       employee.work();
       
       Student student = new Student();
       student.name = "Lisa";
       student.age = 20;
       student.major = "Teknik Informatika";
       student.introduce();
       student.study();

       //contoh 2
       Circle circle = new Circle("Merah", 5);
       System.out.println("Luas lingkaran: " + circle.getArea());
       
       Rectangle rectangle = new Rectangle("Biru", 4, 6);
       System.out.println("Luas persegi panjang: " + rectangle.getArea());
    }
 }
 