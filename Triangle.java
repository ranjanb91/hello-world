class Triangle{
	private int base,height;
	public void setBase(int base){
		this.base=base;
	}
	public int getBase(){
		return base;
	}
	public void setHeight(int height){
		this.height=height;
	}
	public int getHeight(){
		return height;
	}
	public int calculateArea(){
		int area = (base*height)/2;
		return area;
	}	
}