package repository.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import repository.mvc.service.BlogService;

@Controller
public class BlogController {

	@Autowired
	private BlogService service;

	@RequestMapping("/")
	public String start() {
		System.out.println("{{{{{{{{" + service.login() + "}}}}}}}}");
		return "ex/home";
	}

	@RequestMapping("1")
	public void login() {

	}

	@RequestMapping("2")
	public void insertPost() {

	}

	@RequestMapping("3")
	public void selectAllPost() {

	}

	@RequestMapping("4")
	public void selectOnePost() {

	}

	@RequestMapping("5")
	public void deletePost() {

	}

	@RequestMapping("6")
	public void updatePost() {

	}

	@RequestMapping("7")
	public void searchByCategory() {

	}

	@RequestMapping("8")
	public void searchByDivision() {

	}

	@RequestMapping("9")
	public void searchByKeyword() {

	}

	@RequestMapping("a")
	public void insertCategory() {

	}

	@RequestMapping("b")
	public void selectCategory() {

	}

	@RequestMapping("c")
	public void updateCategory() {

	}

	@RequestMapping("d")
	public void deleteCategory() {

	}
}
