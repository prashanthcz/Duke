import no.priv.garshol.duke.cleaners.*;
import no.priv.garshol.duke.Cleaner;


public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cleaner cleaner = new LowerCaseNormalizeCleaner();
		System.out.println(cleaner.clean("SSS"));

	}

}
