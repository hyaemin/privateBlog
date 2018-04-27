package repository.mvc.service;

public interface BlogService {
	public void login();

	public void insertPost();

	public void selectAllPost();

	public void selectOnePost();

	public void deletePost();

	public void updatePost();

	public void searchByCategory();

	public void searchByDivision();

	public void searchByKeyword();

	public void insertCategory();

	public void selectCategory();

	public void updateCategory();

	public void deleteCategory();
}
