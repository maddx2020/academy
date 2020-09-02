package by.academy.Lesson13;

import java.util.function.Consumer;

public class Task6 {

	public static void main(String[] args) {

		HeavyBox hb = new HeavyBox(500);

		Consumer<HeavyBox> otgruzka = x -> System.out.println("Отгрузили ящик с весом " + x.getWeight());

		Consumer<HeavyBox> otpravka = x -> System.out.println("Отправляем ящик с весом " + x.getWeight());

		otgruzka.andThen(otpravka).accept(hb);

	}

}
