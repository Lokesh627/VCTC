package interface_study;

public class Child implements Father, Mother {

	
	@Override
	public void recipe() {
		System.out.println("Recipe completed by child");
		
	}

	@Override
	public void looks() {
		System.out.println("Looks completed by child");
		
	}

	@Override
	public void money() {
		System.out.println("Money completed by child");
		
	}

	@Override
	public void property() {
		System.out.println("Property completed by child");
		
	}

}
