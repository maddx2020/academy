//Написать класс, который умеет хранить в себе массив любых типов данных (int, long etc.). 
//	Реализовать метод:
//	а) который возвращает элемент по индексу (проверка границ массива)
//	б) который добавляет элемент в конец массива (проверка границ массива)
//	в) который добавляет элемент в массив по индексу(проверка границ, сдвиг массива)
//	нужно учесть, что если массив заполнен, увеличиваем массив в 2 раза

package by.academy.Lesson9_Generic.Ex10;

public class Modification<T extends Number> {

	private T[] items;
	private int i = -1;

	public Modification() {
		super();
	}

	public Modification(T[] items) {
		super();
		this.items = items;

	}

	
	
	
	public T[] getItems() {
		return items;
	}

	public void setItems(T[] items) {
		this.items = items;
	}

	// implement check for array border
	public T indexReturnValue(T[] items, int index) {
		if (index < 0 || index >= items.length) {
			System.out.println("Такого индекса в данном массиве Нет!");
			return null;
		} else if (items[index] == null) {
			System.out.println("Элемента под таким индесом нет в массиве - Пустая ячейка!");
		}
		return items[index];
	}

	// implement check for array border,add 1 element
	@SuppressWarnings("unchecked")
	public void addItemToEnd(T[] items, T item) {
		if (items[items.length - 1] == null) {
			System.out.println("\nПоследняя ячейка пустая - вносим туда элемент. ");
			items[items.length - 1] = item;
		} else {
			System.out.println("\nМассив заполнен. Увеличиваем массив на один элемент!");
			T[] items2 = (T[]) new Integer[items.length + 1];
			for (int i = 0; i < items.length; i++) {
				items2[i] = items[i];
			}
			items2[items.length] = item;
			this.items = items2;
		}

	}

	// implement: check for array border;switch array(if full -> array.length*2)
	@SuppressWarnings({ "unchecked" })
	public void addItemByIndex(T[] items, int index, T item) {
		if (index < 0 || index >= items.length) {
			System.out.println("Такого индекса в данном массиве Нет!");
		} else if (items[index] == null) {
			System.out.println("Под этим индексом пустая ячейка. Вставляем наш элемент");
			items[index] = item;
		} else {
			System.out.println("\nМассив заполнен. Увеличиваем массив на один элемент!");
			T[] items2 = (T[]) new Integer[items.length * 2];
			for (int j = 0; j < items.length + 1; j++) {
				i++;
				if (i != index) {
					items2[j] = items[i];
				} else {
					items2[j] = item;
					items2[j + 1] = items[i];
					j++;
				}
			}
			this.items = items2;
		}

	}

}
