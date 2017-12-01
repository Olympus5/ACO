package bean;

public class Selection {
	private Integer begin;
	private Integer end;
	
	
	
	public Selection(Integer begin, Integer end) {
		super();
		this.begin = begin;
		this.end = end;
	}
	
	
	@Override
	public String toString() {
		
		return "debut : " + this.getBegin() + "  fin : " + this.getEnd();
	}


	public Integer getBegin() {
		return begin;
	}
	public void setBegin(Integer begin) {
		this.begin = begin;
	}
	public Integer getEnd() {
		return end;
	}
	public void setEnd(Integer end) {
		this.end = end;
	}
	
	
}
