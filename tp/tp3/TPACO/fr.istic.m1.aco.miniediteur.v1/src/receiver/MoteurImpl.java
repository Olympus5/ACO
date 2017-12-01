package receiver;

import bean.Selection;


/**
 * MoteurImpl class
 * 
 * @author Erwan IQUEL, Mathieu LECLEC'H
 * @version 1.0
 */
public class MoteurImpl implements Moteur {

	protected StringBuffer buffer;
	protected String pressePapier;
	protected Selection selection;

	public MoteurImpl() {
		this.selection = new Selection(0,0);
		this.buffer = new StringBuffer();
		this.pressePapier = "";
	}
	
	@Override
	public StringBuffer getBuffer() {
		return this.buffer;
	}
	
	@Override
	public String getPressePapier() {
		return this.pressePapier;
	}
	
	@Override
	public Selection getSelection() {
		return this.selection;
	}

	@Override
	public void coller() {
		if (this.pressePapier != "") {
			if (this.selection.getBegin() != this.selection.getEnd()) {
				this.buffer.delete(this.selection.getBegin(), this.selection.getEnd());
				this.selection = new Selection(this.selection.getBegin(), this.selection.getBegin());
			}
			buffer.insert(this.selection.getBegin(), pressePapier);
			this.selection = new Selection(this.selection.getBegin() + pressePapier.length(),
					this.selection.getEnd() + pressePapier.length());
		}
	}

	@Override
	public void copier() {
		if (this.selection == null || this.selection.getBegin() == this.selection.getEnd()) {
			return;
		}
		this.pressePapier = this.buffer.substring(this.selection.getBegin(), this.selection.getEnd());
	}

	@Override
	public void couper() {
		this.pressePapier = this.buffer.substring(this.selection.getBegin(), this.selection.getEnd());
		this.buffer.delete(this.selection.getBegin(), this.selection.getEnd());
		this.selection = new Selection(this.selection.getBegin() - pressePapier.length(),
				this.selection.getEnd() - pressePapier.length());
	}

	@Override
	public void inserer(String s) {
		if (!s.isEmpty()) {
			if (this.selection.getBegin() != this.selection.getEnd()) {
				this.buffer.delete(this.selection.getBegin(), this.selection.getEnd());
				this.selection = new Selection(this.selection.getBegin(), this.selection.getBegin());
			}
			buffer.insert(this.selection.getBegin(), s);
			this.selection = new Selection(this.selection.getBegin() + s.length(),
					this.selection.getEnd() + s.length());
		}
	}

	@Override
	public void selectionner(int begin, int end) {
		if (begin > this.buffer.length() ) {
			begin = this.buffer.length() ;
		}
		if (end > this.buffer.length()) {
			end =this.buffer.length() ;
		}
		this.selection = new Selection(begin, end);
	}

	@Override
	public void delete() {
		if (this.selection.getBegin() != this.selection.getEnd()) {
			this.buffer.delete(this.selection.getBegin(), this.selection.getEnd());
			this.selection = new Selection(this.selection.getBegin(), this.selection.getBegin());
		}
	}

}
