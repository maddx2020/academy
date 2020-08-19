//Переписать класс FileCopy: 
//	a) Добавить блок try-with-resources. 
//	б) Добавить catch блок для обработки IOException. (Задание с урока)

package by.academy.Lesson12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task1 {
	public static void main(String[] args) {

		try (FileInputStream fileIn = new FileInputStream("NewFile.txt");
				FileOutputStream fileOut = new FileOutputStream("copied_file.txt")) {

			int a;
			while ((a = fileIn.read()) != -1) {
				fileOut.write(a);
			}
			System.out.println("It's OK!");
		} catch (IOException e) {
			System.out.println("No such file in directory!");
		}

	}
}
