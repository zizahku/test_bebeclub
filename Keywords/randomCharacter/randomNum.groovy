package randomCharacter

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import java.util.Random

public class CustomKeywords {

	private static final Random random = new Random();

	@Keyword
	public static String generateRandomPhoneNumber() {
		String prefix = "0857"
		String randomDigits = generateRandomDigits(9)
		return prefix + randomDigits
	}

	private static String generateRandomDigits(int length) {
		Random random = new Random()
		StringBuilder digits = new StringBuilder()

		for (int i = 0; i < length; i++) {
			digits.append(random.nextInt(10))
		}

		return digits.toString()
	}

	@Keyword
	public static String generateRandomAddress() {
		// Generate nama jalan secara acak
		String randomNamaJalan = generateRandomString(10, true);

		// Generate nomor rumah secara acak
		String randomNomorRumah = "No " + (random.nextInt(50) + 1) + generateRandomString(1, true);

		// Generate nama kelurahan secara acak
		String randomNamaKelurahan = generateRandomString(8, true);

		// Gabungkan komponen-komponen alamat dengan prefix "Jalan "
		String result = "Jalan " + randomNamaJalan + ", " + randomNomorRumah + ", " + randomNamaKelurahan;

		return result;
	}

	// Fungsi untuk menghasilkan string acak dengan panjang tertentu
	private static String generateRandomString(int length, boolean useAlphabet) {
		StringBuilder randomString = new StringBuilder();
		String characters = useAlphabet ? "ABCDEFGHIJKLMNOPQRSTUVWXYZ" : "0123456789";

		for (int i = 0; i < length; i++) {
			char randomChar = characters.charAt(random.nextInt(characters.length()));
			randomString.append(randomChar);
		}

		return randomString.toString();
	}

	public static void main(String[] args) {
		// Generate alamat acak
		String randomAddress = generateRandomAddress();

		// Menampilkan hasil
		System.out.println("Random Address: " + randomAddress);
	}
}

