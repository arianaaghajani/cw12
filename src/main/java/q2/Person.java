package q2;

import java.time.LocalDate;

public interface Person {
   public LocalDate getBirthDate();
    default int age(LocalDate birthDate){
        return LocalDate.now().getYear() -  birthDate.getYear();
    }
}
