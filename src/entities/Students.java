package entities;

public class Students {
	private Integer codstudents;

	public Students(Integer codstudents) {
		this.codstudents = codstudents;
	}

	public Integer getCodstudents() {
		return codstudents;
	}

	public void setCodstudents(Integer codstudents) {
		this.codstudents = codstudents;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codstudents == null) ? 0 : codstudents.hashCode());
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
		Students other = (Students) obj;
		if (codstudents == null) {
			if (other.codstudents != null)
				return false;
		} else if (!codstudents.equals(other.codstudents))
			return false;
		return true;
	}
	
	
	

}
