package by.academy.Lesson8enum;

public enum Status {
	New("New"), InProgress("In progress"), Done("Done");

	private String str;

	private Status(String str) {
		this.str = str;
	}

	public String getStr() {
		return str;
	}

}
