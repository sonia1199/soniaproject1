package ression4;

import org.testng.annotations.Test;

import commoncodes.amazonbaseclass;
import commoncodes.amazonpage;

public class amazonTest extends amazonbaseclass{
  @Test
  public void f() throws InterruptedException {
	  amazonpage ob=new amazonpage (driver);
	  ob.searchthis();
	  Thread.sleep(2000);
	  ob.hitsearch();
	  Thread.sleep(2000);
	  ob.clickhouse();
	  Thread.sleep(2000);
	  ob.clickaddcart();
	  Thread.sleep(2000);
  }
  
}
