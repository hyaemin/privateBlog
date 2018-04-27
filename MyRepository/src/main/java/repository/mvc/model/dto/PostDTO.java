package repository.mvc.model.dto;

public class PostDTO {
	private String postNo;
	private String title;
	private String content;
	private String postDate;
	private String categoryNo;
	private String Id;

	public PostDTO() {
		super();
	}

	public PostDTO(String postNo, String title, String content, String postDate, String categoryNo, String id) {
		super();
		this.postNo = postNo;
		this.title = title;
		this.content = content;
		this.postDate = postDate;
		this.categoryNo = categoryNo;
		Id = id;
	}

	public String getPostNo() {
		return postNo;
	}

	public void setPostNo(String postNo) {
		this.postNo = postNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPostDate() {
		return postDate;
	}

	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}

	public String getCategoryNo() {
		return categoryNo;
	}

	public void setCategoryNo(String categoryNo) {
		this.categoryNo = categoryNo;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

}
