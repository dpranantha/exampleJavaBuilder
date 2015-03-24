package builder;

class Juice {
	private final NameRepository fruit;
	private final double sugar;
	private final double water;
	
	public static class Builder{
		private NameRepository fruit;
		private double sugar;
		private double water;
		
		//builder methods for setting property
        public Builder fruit(NameRepository fruit){this.fruit = fruit; return this; }
        public Builder sugar(double gram){this.sugar = gram; return this; }
        public Builder water(double cc){this.water = cc; return this; }
        
        public Juice build(){
        	return new Juice(this);
        }
	}
	
	private Juice(Builder builder){
		this.fruit = builder.fruit;
		this.sugar = builder.sugar;
		this.water = builder.water;
	}
	
	@Override
    public String toString() {
		String f = "";
		for(Iterator iter = fruit.getIterator();iter.hasNext();){
			if(f=="")
				f = (String) iter.next();
			else	
				f = f + "," + (String) iter.next();
		}
        return "Juice{" + "fruit=" + f + ", sugar=" + sugar + " gram, water=" + water + " cc" + "}";
    }

}
