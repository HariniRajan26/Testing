package selenium.TestDay9;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest3 {
	 @Test
	  public void test01() {
		  Assert.assertEquals(true,false);
	  }
	  @Test
	  public void test02() {
		  Assert.assertEquals(true,true);
		  }
}
