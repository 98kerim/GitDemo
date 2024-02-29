public class SuperClass {
	private int id;
		public SuperClass(int id) {
		this.id = id;
		
		public class SubClass extends SuperClass {
			private String name;
			
			public SubClass(int id, String name) {
				super(id);
				this.name = name;
			}
		}
	}
}
	