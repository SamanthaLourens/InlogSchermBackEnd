package inloggen.dto;



public class PersonDto {
	
	private Long id;
	
	private String name;
	
	public PersonDto() {
		
	}
	

	public PersonDto(Long id, String name, String lastName) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
