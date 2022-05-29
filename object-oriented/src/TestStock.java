import com.ibm.stock.Broker;
import com.ibm.stock.Exchange;
import com.ibm.stock.Holder;
import com.ibm.stock.Stock;
import com.ibm.stock.StockSingleton;

public class TestStock {

	public static void main(String[] args) {
		
		//Stock ril = new Stock();
		
		Holder hh = StockSingleton.getStock();
		hh.view();
		
		Broker bb = StockSingleton.getStock();
		bb.view();
		bb.get();
		
		Exchange xx = StockSingleton.getStock();
		xx.view();
		xx.get();
		xx.set();
		
		/*Holder h = ril;
		h.view();
		
		Broker b = ril;
		b.view();
		b.get();
		
		Exchange x = ril;
		x.view();
		x.get();
		x.set();*/
		
		System.out.println(hh == bb);
		System.out.println(bb == xx);
	}

}
