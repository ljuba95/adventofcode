package sixteen;

public class Sue {
	int id;
	int [] yo = new int[10];
	
	public Sue(int id){
		this.id = id;
		for (int i = 0; i < yo.length; i++) {
			yo[i]=-1;
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int[] getYo() {
		return yo;
	}

	public void setYo(int[] yo) {
		this.yo = yo;
	}

	
	
	

}
