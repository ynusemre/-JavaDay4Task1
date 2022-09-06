
package InterfaceAbstractDemo;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Program {
	public static void main(String[] args) throws Exception {

		// Customer customer =new Customer(5,"Yunus Emre", "Geyik",(1999,1,6),
		// 33334255402);

//		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
//
//		boolean result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong("33334255402"), "Yunus Emre", "Geyik",
//				1999);
//
//		System.out.println("Doğrulama :" + (result ? "Başarılı giriş" : "Başarısız Giriş"));

		BaseCustomerManager baseCustomerManager = new NeroCustomerManager(new MernisServiceAdapter());
		baseCustomerManager.save(new Customer(5, "Yunus Emre", "Geyik", 1999, "33334255402"));

	}
}
