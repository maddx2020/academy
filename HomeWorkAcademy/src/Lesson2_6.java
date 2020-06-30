
public class Lesson2_6 {
	public static void main(String[] args) {
		int s = 3_750_050;
		int sec, days, hours, week, month;
		int m;
		int min, h, d, w;
		sec = s % 60;
		m = s / 60;
		min = m % 60;
		h = m / 60;
		hours = h % 24;
		d = h / 24;
		days = d % 7;
		w = d / 7;
		week = w % 4;
		month = w / 4;

		System.out.println(month + " месяц(ев) " + week + " неделя(и) " + days + " суток " + hours + " часов " + min
						  + " минут " + sec + " секунд");
	}
}