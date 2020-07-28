package by.academy.Lesson9;

public class MinMax<T extends Number> {
	private T[] array;
	private Double min;
	private Double max;

	public MinMax() {
		super();
	}
	
	
	public MinMax(T[] array) {
		super();
		this.array = array;
	}

	public Double minArray() {
		min = array[0].doubleValue();
		for (T el : array) {
			if (el.doubleValue() < min) {
				min = el.doubleValue();
			}
		}
		return min;
	}

	public Double maxArray() {
		max = array[0].doubleValue();
		for (T el : array) {
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



