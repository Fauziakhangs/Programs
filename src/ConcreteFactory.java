
public class ConcreteFactory {

}

class Word90 extends MicroOfficeFactory{

	@Override
	public Panel createPanel() {
		// TODO Auto-generated method stub
		return new PanelWord90();
		
	}

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new ButtonWord90();
	}

	@Override
	public Textbox createTextBox() {
		// TODO Auto-generated method stub
		return new TextBoxWord90();
	}
	
	
}
class Word00 extends MicroOfficeFactory{

	@Override
	public Panel createPanel() {
		// TODO Auto-generated method stub
		return new PanelWord00();
	}

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new ButtonWord00();
	}

	@Override
	public Textbox createTextBox() {
		// TODO Auto-generated method stub
		return new TextBoxWord00();
	}
	
}
class Word10 extends MicroOfficeFactory{

	@Override
	public Panel createPanel() {
		// TODO Auto-generated method stub
		return new PanelWord10();
	}

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new ButtonWord10();
	}

	@Override
	public Textbox createTextBox() {
		// TODO Auto-generated method stub
		return new TextBoxWord10();
	}
	
}
class Word18 extends MicroOfficeFactory{

	@Override
	public Panel createPanel() {
		// TODO Auto-generated method stub
		return new PanelWord18();
	}

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new ButtonWord18();
	}

	@Override
	public Textbox createTextBox() {
		// TODO Auto-generated method stub
		return new TextBoxWord18();
	}
	
}