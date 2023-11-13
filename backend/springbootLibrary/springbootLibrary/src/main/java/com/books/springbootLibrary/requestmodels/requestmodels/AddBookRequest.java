package com.books.springbootLibrary.requestmodels.requestmodels;

import lombok.Data;

@Data
public class AddBookRequest {

    private String title;

    private String author;

    private String description;

    private int copies;

   
	private String category;

    private String img;
    
    public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getDescription() {
		return description;
	}

	public int getCopies() {
		return copies;
	}

	public String getCategory() {
		return category;
	}

	public String getImg() {
		return img;
	}


}
