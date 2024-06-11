package advance.dev;

public class MainApp {
   public static void main(String[] args) {
	   Student std1 = new Student("Nguyên", 18, "Huế", "0362839777", 7.6);
	   Student std2 = null;
	   try {
		   std2 = (Student) std1.clone();
	   }catch(CloneNotSupportedException Exception) {
		   Exception.printStackTrace();
	   }
	   System.out.println("Thông tin của std1: "+std1.toString());
	   System.out.println("Thông tin của std2: "+std2.toString());
   }
}