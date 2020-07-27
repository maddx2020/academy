package by.academy.Lesson9;

public class MinMax<T extends Number> {
	private T[] array;
	Double min;
	Double max;

	public MinMax() {
		super();
	}
	
	
	public MinMax(T[] array) {
		super();
		this.array = array;
	}

	public Double minArray() {
		for (T el : array) {
			min = array[0].doubleValue();
			if (el.doubleValue() < min) {
				min = el.doubleValue();
			}
		}
		return min;
	}

	public Double maxArray() {
		for (T el : array) {
			max = el.doubleValue();
			if (el.doubleValue() > max) {
				max = el.doubleValue();
			}
		}
		return max;
	}

	public boolean equalMinMax(Double max, Double min) {
	return max.equals(min);


	}
}



