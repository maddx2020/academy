//Переписать класс FileInputOutputStreamDemo: 
//	a) Добавить блок try-with-resources. 
//	б) Замените for (int i = 0; i < c.length; i++) на блок for-each.  
//	в) Пусть file.txt записывается в каталог src/io. (Задание с урока)

package by.academy.Lesson12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Task2 {

	public static void main(String[] args) {

		File file = new File("./src/io/");

		if (file.exists()) {
			System.out.println("Catalog exist");
		}else {
			file.mkdirs();
		}

		try (OutputStream output = new FileOutputStream(".//src//io//outTask2.txt");
				InputStream input = new FileInputStream(".//src//io//outTask2.txt")) {

			char[] symbols = { 'a', 'b', 'c', 'd' };
			for (char c : symbols) {
				// Запись каждого символа в текстовый файл
				output.write(c);
			}

			int size = input.available();

			for (int i = 0; i < size; i++) {
				// Чтение текстового файла посимвольно
				System.out.print((char) input.read() + " ");
			}

		} catch (IOException e) {
			System.out.print("Exception");
		}
	}
}
