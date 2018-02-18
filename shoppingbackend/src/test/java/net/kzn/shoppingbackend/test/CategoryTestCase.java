package net.kzn.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;
	
	
	private static CategoryDAO categoryDAO;
	
	
	private Category category;
	
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.kzn.shoppingbackend");
		context.refresh();
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
	}
	
	
	@Test
	public void testAddCategory() {
		
		category = new Category();
		
		category.setName("Mobile");
		category.setDescription("This is some description for Mobile!");
		category.setImageURL("CAT_3.png");
		
		assertEquals("Successfully added a category inside the table!",true,categoryDAO.add(category));
		
		
	}
	
//	@Test
//	public void testGetCategory(){
//		category = categoryDAO.get(2);
//		assertEquals("Successfully get featched using category id","Television",category.getName());
//	}
	
	
	
//		@Test
//	public void testUpdateTheCategory(){
//		category = categoryDAO.get(2);
//		category.setName("TV");
//		assertEquals("Successfully Update  using id and set value",true,categoryDAO.update(category));
//	}
	
//	@Test
//	public void testDeleteCategory(){
//		category = categoryDAO.get(2);
//		assertEquals("Successfully Delete particular category",true,categoryDAO.delete(category));
//	}
	
	
//	
//	@Test
//	public void testListCategory(){
//		category = categoryDAO.get(2);
//		assertEquals("Successfully feateched list of catregory ",3,categoryDAO.list().size());
//	}
	

//	@Test
//	public void testCRUDCategory(){
//		
//		// Add Operations
//		category = new Category();
//		
//		category.setName("Laptops");
//		category.setDescription("This is some description for Laptops!");
//		category.setImageURL("CAT_1.png");
//		
//		assertEquals("Successfully added a category inside the table!",true,categoryDAO.add(category));
//		
//		category = new Category();
//		
//		category.setName("Television");
//		category.setDescription("This is some description for Television!");
//		category.setImageURL("CAT_2.png");
//		
//		assertEquals("Successfully added a category inside the table!",true,categoryDAO.add(category));
//		
//		
//		
//		
//		// Update (Fetching, Rename)
//		
//		
//		category = categoryDAO.get(2);
//		category.setName("TV");
//		assertEquals("Successfully Update  using id and set value",true,categoryDAO.update(category));
//
//	
//		
//		// Delete the category
//		assertEquals("Successfully Update  using id and set value",true,categoryDAO.delete(category));
//
//		
//		
//	// Test List fetch category
//		
//		
//		assertEquals("Successfully feateched list of catregory ",1,categoryDAO.list().size());
//		
//		
//	}
}