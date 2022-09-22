package com.cg.springaw;

public class Heart 
{
	private String nameofAnimal;
	private int noofHeart;
	
	//getter and setter method
	public String getNameofAnimal() {
		return nameofAnimal;
	}

	public void setNameofAnimal(String nameofAnimal) {
		this.nameofAnimal = nameofAnimal;
	}

	public int getNoofHeart() {
		return noofHeart;
	}

	public void setNoofHeart(int noofHeart) {
		this.noofHeart = noofHeart;
	}

	public void pump()
	{
		System.out.println("Your heart is pumping and you r alive");
	}
}
