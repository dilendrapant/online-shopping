package net.kzn.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList();

	static {
		Category category = new Category();

		// adding first category
		category.setId(1);
		category.setName("Television");
		category.setDiscription("This is some discription for Television");
		category.setImageURL("CAT_1.png");

		categories.add(category);

		// second category

		category = new Category();

		category.setId(2);
		category.setName("Mobile");
		category.setDiscription("This is some discription for Mobile");
		category.setImageURL("CAT_2.png");

		categories.add(category);

		// Third category

		category = new Category();
		category.setId(3);
		category.setName("Laptops");
		category.setDiscription("This is some discription for Laptops");
		category.setImageURL("CAT_3.png");

		categories.add(category);
		
		// Forth category

				category = new Category();
				category.setId(4);
				category.setName("Tablets");
				category.setDiscription("This is some discription for Tablets");
				category.setImageURL("CAT_3.png");

				categories.add(category);

	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

}
