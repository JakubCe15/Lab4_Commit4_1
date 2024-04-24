/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) {
    try {
      Service s = new Service();

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Podaj imię oraz wiek nowego studenta, lub wpisz 'exit' aby zakończyć");
      while (true) {
      System.out.println("Podaj imię:  ");
      String imię = br.readLine();
      if (imię.equals("exit")){
        break;
      }
      System.out.println("Podaj wiek:  ");
      int wiek = Integer.parseInt(br.readLine());

      s.addStudent(new Student(imię, wiek));
      }
      s.addStudent(new Student("Krzysztof", 20));
      s.addStudent(new Student("Janusz", 40));

      var students = s.getStudents();
      for(Student current : students) {
        System.out.println(current.ToString());
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}