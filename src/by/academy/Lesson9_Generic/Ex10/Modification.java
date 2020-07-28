//Написать класс, который умеет хранить в себе массив любых типов данных (int, long etc.). 
//	Реализовать метод:
//	а) который возвращает элемент по индексу (проверка границ массива)
//	б) который добавляет элемент в конец массива (проверка границ массива)
//	в) который добавляет элемент в массив по индексу(проверка границ, сдвиг массива)
//	нужно учесть, что если массив заполнен, увеличиваем массив в 2 раза

package by.academy.Lesson9_Generic.Ex10;

public class Modification<T extends Number> {

	private T[] items;
//	private int index;
	private int result;

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

//	public int getIndex() {
//		return index;
//	}

//	public void setIndex(int index) {
//		this.index = index;
//	}

	private int getResult() {
		return result;
	}

//	public void setResult(int result) {
//		this.result = result;
//	}

	// implement check for array border
	public void indexReturnValue(T[] items, int index) {
		if (index > (items.length - 1)) {
			System.out.println("Элемента с таким индексом в данном массиве - Нет!");

		} else {
			this.result = items[index].intValue();
			System.out.println(getResult());

		}
	}

	// implement check for array border
	public void addItemToEnd(T[] items, double item) {
		if() {
			
		}

	}

	// implement: check for array border;switch array(if full -> array.length*2)
	public void addItemByIndex() {

	}

}
