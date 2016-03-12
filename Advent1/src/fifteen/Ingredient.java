package fifteen;

public class Ingredient {
	
	int capacity;
	int durability;
	int flavor;
	int texture;
	int calories;
	boolean zero;
	
	public Ingredient(int capacity, int durability, int flavor, int texture, int calories) {
		this.capacity = capacity;
		this.durability = durability;
		this.flavor = flavor;
		this.texture = texture;
		this.calories = calories;
		if(capacity + durability + flavor + texture + calories <0)
			zero = true;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getDurability() {
		return durability;
	}

	public void setDurability(int durability) {
		this.durability = durability;
	}

	public int getFlavor() {
		return flavor;
	}

	public void setFlavor(int flavor) {
		this.flavor = flavor;
	}

	public int getTexture() {
		return texture;
	}

	public void setTexture(int texture) {
		this.texture = texture;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public boolean isZero() {
		return zero;
	}

	public void setZero(boolean zero) {
		this.zero = zero;
	}
	
	
}
