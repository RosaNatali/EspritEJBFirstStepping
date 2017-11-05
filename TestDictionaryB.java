package test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.esprit.dictionary.services.DictionaryServicesRemote;


public class TestDictionaryB{

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();

		DictionaryServicesRemote proxy = (DictionaryServicesRemote) context.lookup(
				"dictionary-essid-ear/dictionary-essid-ejb/DictionaryServices!com.esprit.dictionary.services.DictionaryServicesRemote");

		proxy.welcome("ICH BIN SARSOURA !!!");
		proxy.traductor("Bienvenue", "Welcome");
		
		

		
	}

}