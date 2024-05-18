package MyWebDriverDemo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {

	public static void dropdownSelection(WebElement ele,String value)
	{
		Select dd=new Select(ele);
		List<WebElement> alloptions=dd.getOptions();
		System.out.println("Total options are: "+alloptions.size());
		System.out.println("Is drop down supports multiple selection:? "+dd.isMultiple());
		
		for(WebElement i:alloptions)
		{
			System.out.println(i.getText());
			if(i.getText().contains(value))
			{
				i.click();
				break;
			}
		}
		
	}
	
	
	
}