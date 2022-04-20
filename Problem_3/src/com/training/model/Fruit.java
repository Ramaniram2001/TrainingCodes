package com.training.model;

public class Fruit implements Comparable<Fruit> {
	private String fruits;

	public Fruit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fruit(String fruits) {
		super();
		this.fruits = fruits;
	}

	public String getFruits() {
		return fruits;
	}

	public void setFruits(String fruits) {
		this.fruits = fruits;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fruits == null) ? 0 : fruits.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		if (fruits == null) {
			if (other.fruits != null)
				return false;
		} else if (!fruits.equals(other.fruits))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Fruit [fruits=" + fruits + "]";
	}

	@Override
	public int compareTo(Fruit obj) {
		return this.fruits.compareTo(obj.fruits);
		
	}
	
	

}