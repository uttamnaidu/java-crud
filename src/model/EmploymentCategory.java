package model;

public enum EmploymentCategory {
	yes("����"),
	no("���"),
	sklad("�����"),
	other("������");
	
	private String text;
	private EmploymentCategory(String text)
	{
		this.text = text;
		
	}
	@Override
	public String toString() {
		return text;
	}
}
