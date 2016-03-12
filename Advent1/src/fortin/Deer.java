package fortin;

public class Deer {
	
	String name;
	int speed;
	int flyTime;
	int restTime;
	int distance=0;
	int flyCount=0;
	int restCount=0;
	int points = 0;
	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	boolean flyin;
	
	public Deer(String name, int speed, int flytime, int resttime){
		this.name = name;
		this.speed = speed;
		this.flyTime = flytime;
		this.restTime = resttime;
		flyin = true;
		flyCount = 0;
		restCount = 0;
	}

	public void check(){
		if(flyin){
			distance += speed;
			
			if(flyCount++ == flyTime -1){
				flyin = false;
				restCount = 0;
			}
		} else{
			if(restCount++ == restTime -1){
				flyin = true;
				flyCount = 0;
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getFlyTime() {
		return flyTime;
	}

	public void setFlyTime(int flyTime) {
		this.flyTime = flyTime;
	}

	public int getRestTime() {
		return restTime;
	}

	public void setRestTime(int restTime) {
		this.restTime = restTime;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getFlyCount() {
		return flyCount;
	}

	public void setFlyCount(int flyCount) {
		this.flyCount = flyCount;
	}

	public int getRestCount() {
		return restCount;
	}

	public void setRestCount(int restCount) {
		this.restCount = restCount;
	}

	public boolean isFlyin() {
		return flyin;
	}

	public void setFlyin(boolean flyin) {
		this.flyin = flyin;
	}
	
}
