package entity;

public class Equipment {
	private int eid;
	private int uid;
	private int flag=0;
	private String ps;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}


	public String getPs() {
		return ps;
	}

	public void setPs(String ps) {
		this.ps = ps;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

}
