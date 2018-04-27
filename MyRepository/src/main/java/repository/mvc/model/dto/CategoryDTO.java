package repository.mvc.model.dto;

public class CategoryDTO {

	private String categoryNo;
	private String categoryName;
	private String divisionName;

	public CategoryDTO() {
		super();
	}

	public CategoryDTO(String categoryNo, String categoryName, String divisionName) {
		super();
		this.categoryNo = categoryNo;
		this.categoryName = categoryName;
		this.divisionName = divisionName;
	}

	public String getCategoryNo() {
		return categoryNo;
	}

	public void setCategoryNo(String categoryNo) {
		this.categoryNo = categoryNo;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDivisionName() {
		return divisionName;
	}

	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}

}
