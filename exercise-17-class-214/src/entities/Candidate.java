package entities;

public class Candidate implements Comparable<Candidate> {
	
	private String name;
	private Integer votes;
	
	public Candidate() {}
	
	public Candidate(String name, Integer votes) {
		this.name = name;
		this.votes = votes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getVotes() {
		return votes;
	}

	public void setVotes(Integer votes) {
		this.votes = votes;
	}
	
	@Override 
	public String toString() {
		return getName() + ": " + getVotes();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Candidate other = (Candidate) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Candidate other) {
		return -this.getVotes().compareTo(other.getVotes());
	}
}
