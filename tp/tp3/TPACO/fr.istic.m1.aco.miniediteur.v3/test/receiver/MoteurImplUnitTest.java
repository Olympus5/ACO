package receiver;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import bean.Selection;

public class MoteurImplUnitTest {

	private MoteurImpl moteur;

	@Before
	public void setup() {
		this.moteur = new MoteurImpl();
	}

	// DEBUT COPIER TEST
	@Test
	public void copierTest() {
		// setup
		this.moteur.buffer = new StringBuffer("coucou");
		this.moteur.selection = new Selection(0, 6);

		// test
		this.moteur.copier();

		// asserts
		assertThat(this.moteur.pressePapier).isEqualTo("coucou");
	}

	@Test
	public void copierTestWhenSelectionIsNull() {
		// setup
		this.moteur.buffer = new StringBuffer("abcdef");
		this.moteur.pressePapier = "initial";
		this.moteur.selection=null;
		// test
		this.moteur.copier();

		// asserts
		assertThat(this.moteur.pressePapier).isEqualTo("initial");
	}

	// DEBUT COLLER TEST
	@Test
	public void collerTest() {
		this.moteur.buffer = new StringBuffer("abc");
		this.moteur.selection = new Selection(3, 3);
		this.moteur.pressePapier = "TEST";
		this.moteur.coller();
		assertThat(this.moteur.buffer.toString()).isEqualTo("abcTEST");
	}

	@Test
	public void collerTestWhenSelectionIsInsideTheText() {
		this.moteur.buffer = new StringBuffer("abc");
		this.moteur.selection = new Selection(2, 3);
		this.moteur.pressePapier = "TEST";
		this.moteur.coller();
		assertThat(this.moteur.buffer.toString()).isEqualTo("abTEST");
	}

	@Test
	public void collerTestSelectionChanging() {
		this.moteur.buffer = new StringBuffer("abc");
		this.moteur.selection = new Selection(2, 3);
		this.moteur.pressePapier = "TEST";
		this.moteur.coller();

		Selection newSelect = new Selection(6, 6);

		assertThat(this.moteur.selection.getBegin()).isEqualTo(newSelect.getBegin());
		assertThat(this.moteur.selection.getEnd()).isEqualTo(newSelect.getEnd());
	}

	@Test
	public void collerTestWhenPressePapierIsEmpty() {
		this.moteur.buffer = new StringBuffer("abc");
		this.moteur.selection = new Selection(2, 3);
		this.moteur.pressePapier = "";
		this.moteur.coller();
		Selection newSelect = new Selection(2, 3);
		assertThat(this.moteur.buffer.toString()).isEqualTo("abc");
		assertThat(this.moteur.selection.getBegin()).isEqualTo(newSelect.getBegin());
		assertThat(this.moteur.selection.getEnd()).isEqualTo(newSelect.getEnd());
	}

	// DEBUT INSERER TEST

	@Test
	public void insererTest() {
		this.moteur.buffer = new StringBuffer("abc");
		this.moteur.selection = new Selection(2, 2);
		this.moteur.inserer("TEST");
		Selection newSelect = new Selection(6, 6);
		assertThat(this.moteur.buffer.toString()).isEqualTo("abTESTc");
		assertThat(this.moteur.selection.getBegin()).isEqualTo(newSelect.getBegin());
		assertThat(this.moteur.selection.getEnd()).isEqualTo(newSelect.getEnd());
	}

	@Test
	public void insererTestWhenSelecting() {
		this.moteur.buffer = new StringBuffer("abc");
		this.moteur.selection = new Selection(2, 3);
		this.moteur.inserer("TEST");
		Selection newSelect = new Selection(6, 6);
		assertThat(this.moteur.buffer.toString()).isEqualTo("abTEST");
		assertThat(this.moteur.selection.getBegin()).isEqualTo(newSelect.getBegin());
		assertThat(this.moteur.selection.getEnd()).isEqualTo(newSelect.getEnd());
	}

	// DEBUT SELECTIONNER

	@Test
	public void selectionnerTest() {
		this.moteur.buffer.append("dezfeirjfoefo");
		Selection newSelect = new Selection(6, 6);
		this.moteur.selectionner(6, 6);
		assertThat(this.moteur.selection.getBegin()).isEqualTo(newSelect.getBegin());
		assertThat(this.moteur.selection.getEnd()).isEqualTo(newSelect.getEnd());
	}
	
	@Test
	public void selectionnerTestWhenbufferInfSelect() {
		this.moteur.buffer.append("erf");
		Selection newSelect = new Selection(6, 6);
		this.moteur.selectionner(6, 6);

		assertThat(this.moteur.selection.getBegin()).isEqualTo(this.moteur.buffer.length());
		assertThat(this.moteur.selection.getEnd()).isEqualTo(this.moteur.buffer.length());
	}
	
	// BEGIN DELETE
	
	@Test 
	public void Delete() {
		this.moteur.selection = new Selection(6,8);
		this.moteur.delete();
		assertThat(this.moteur.buffer.toString()).isEqualTo("deijfofoeuafipu");
	}
	
	@Test 
	public void DeleteWhenSelectionIsNull() {
		this.moteur.selection = new Selection(6,6);
		this.moteur.delete();
		assertThat(this.moteur.buffer.toString()).isEqualTo("deijfoeffoeuafipu");
	}
	
}
