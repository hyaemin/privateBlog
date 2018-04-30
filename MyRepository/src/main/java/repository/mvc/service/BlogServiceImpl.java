package repository.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;

import repository.mvc.model.dao.BlogDAO;

public class BlogServiceImpl implements BlogService {

	@Autowired
	private BlogDAO dao;
	
	@Override
	public String login() {
		// TODO Auto-generated method stub
		return dao.login();
	}

	@Override
	public void insertPost() {
		// TODO Auto-generated method stub

	}

	@Override
	public void selectAllPost() {
		// TODO Auto-generated method stub

	}

	@Override
	public void selectOnePost() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePost() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updatePost() {
		// TODO Auto-generated method stub

	}

	@Override
	public void searchByCategory() {
		// TODO Auto-generated method stub

	}

	@Override
	public void searchByDivision() {
		// TODO Auto-generated method stub

	}

	@Override
	public void searchByKeyword() {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertCategory() {
		// TODO Auto-generated method stub

	}

	@Override
	public void selectCategory() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateCategory() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCategory() {
		// TODO Auto-generated method stub

	}

}
