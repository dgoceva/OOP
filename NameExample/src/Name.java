
public class Name {
	String first;
	String second;
	String family;
	
	public Name(String first, String second, String family) {
		super();
		this.first = first;
		this.second = second;
		this.family = family;
	}

	public Name() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Name [first=" + first + ", second=" + second + ", family=" + family + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((family == null) ? 0 : family.hashCode());
		result = prime * result + ((first == null) ? 0 : first.hashCode());
		result = prime * result + ((second == null) ? 0 : second.hashCode());
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
		Name other = (Name) obj;
		if (family == null) {
			if (other.family != null)
				return false;
		} else if (!family.equals(other.family))
			return false;
		if (first == null) {
			if (other.first != null)
				return false;
		} else if (!first.equals(other.first))
			return false;
		if (second == null) {
			if (other.second != null)
				return false;
		} else if (!second.equals(other.second))
			return false;
		return true;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if (!(obj instanceof Name)) {
//			return false;
//		}
//		Name n = (Name)obj;
//		return this.first.equals(n.first) &&
//				this.second.equals(n.second) &&
//				this.family.equals(n.family);
//	}
//	
//	@Override
//	public int hashCode() {
//		return super.hashCode();
//	}
	
}
