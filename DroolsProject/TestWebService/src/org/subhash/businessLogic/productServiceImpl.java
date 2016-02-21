package org.subhash.businessLogic;

import java.util.ArrayList;
import java.util.List;

public class productServiceImpl {
	
	List<String> bookList = new ArrayList<>();
	List<String> musicList = new ArrayList<>();
	List<String> movieList = new ArrayList<>();
	
	public productServiceImpl(){
		bookList.add("Inferno");
		bookList.add("JoyLand");
		bookList.add("The Death of a Salesman");
		
		musicList.add("Creed");
		musicList.add("Inner Sanctum");
		musicList.add("Metallica");
		
		movieList.add("Deadpool");
		movieList.add("X-men");
		movieList.add("Avengers");
	}
	
	public List<String> getProductCategories(){
		List<String> categories = new ArrayList<>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
	}
	
	public List<String> getProducts(String category){
		switch(category.toLowerCase()){
		case "books":
			return bookList;
		
		case "music":
			return musicList;
		case "movies":
			return movieList;
		}
		return null;
		
		}
		
	}

