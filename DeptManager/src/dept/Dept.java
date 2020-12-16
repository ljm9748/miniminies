package dept;

// VO(Value Object): 데이터를 저장하는 기능만 가지는 클래스 -> read only
// DTO: 데이터를 저장하는 기능을 가지는 클래스, write도 가능하다.

public class Dept {
	
	private int deptno;	
	private String dname;	
	private String loc;
	
	// 생성자 생성	
	public Dept(int deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	// getter/setter
	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}
	
	
	
	
	

}
