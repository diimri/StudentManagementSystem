package p;



public class Student {
	private  static int random=1;
    private  int id;
    private String name;
    private String branch;
    private String section;
    private String mobileNo;
    private String email;
    

	public Student(String name, String branch, String section, String mobileNo, String email) {
		super();
		this.id=random++;
		this.name = name;
		this.branch = branch;
		this.section = section;
		this.mobileNo = mobileNo;
		this.email=email;
	}


	@Override
	public String toString(){
		return id+"  "+name+"  "+branch+"  "+section+"  "+mobileNo+"  "+email;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + id;
		result = prime * result + ((mobileNo == null) ? 0 : mobileNo.hashCode());
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
		Student other = (Student) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		if (mobileNo == null) {
			if (other.mobileNo != null)
				return false;
		} else if (!mobileNo.equals(other.mobileNo))
			return false;
		return true;
	}




}
