import org.openqa.selenium.SearchContext;
import org.openqa.selenium.support.PageFactory;


public class Button extends basic{

	public static void main(String[]args)
	
	{
		tutorial xpath = new tutorial();
	
	PageFactory.initElements(driver, xpath);
		tutorial.input.click();
	
	}

}
