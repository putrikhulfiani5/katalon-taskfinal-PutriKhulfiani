import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

// OPEN ADD TASK
Mobile.tap(findTestObject('btn.addtask'), 0)

// INPUT TASK TITLE
Mobile.setText(findTestObject('field.Entertasktitle'), tasktitle, 0)

// INPUT DESCRIPTION TASK
Mobile.setText(findTestObject('field.Enteryourtask'), desctask, 0)

// SET DATE
Mobile.tap(findTestObject('field.SetDate'), 0)

// If Else + Loop Statement
int totalBulan = bulan.toString().trim().toInteger()

Mobile.comment('Nilai bulan = ' + totalBulan)

if (totalBulan > 0) {
    for (int i = 1; i <= totalBulan; i++) {
        Mobile.tap(findTestObject('btn.setdate-NextMonth'), 0)
    }
} else {
    Mobile.comment('Tetap di bulan sekarang')
}

// PILIH TANGGAL
Mobile.tap(findTestObject("setdate-$tanggal"), 0)

// KLIK OK DI DATE
Mobile.tap(findTestObject('btn.setdate-OK'), 0)

// SET TIME
Mobile.tap(findTestObject('field.SetTime'), 0)

// PILIH JAM
Mobile.tap(findTestObject("settime-$jam"), 0)

Mobile.delay(1)

Mobile.waitForElementPresent(findTestObject("settime-mnt$menit"), 10)

// PILIH MENIT
Mobile.tap(findTestObject("settime-mnt$menit"), 0)

// PILIH PERIOD AM PM 
//Switch Case
switch (period) {
    case 'AM':
        Mobile.tap(findTestObject('settime-AM'), 0)

        break
    case 'PM':
        Mobile.tap(findTestObject('settime-PM'), 0)

        break
    default:
        Mobile.comment('Period tidak valid')}

// KLIK OK DI TIME
Mobile.tap(findTestObject('btn.setTime-OK'), 0)

// ADD KATEGORI
Mobile.tap(findTestObject('droplist.category'), 0)

// Switch Case Statement
switch (kategori) {
    case 'Ayam':
        Mobile.tap(findTestObject('list.categoryAyam'), 0)

        break
    case 'Banking':
        Mobile.tap(findTestObject('list.categoryBanking'), 0)

        break
    case 'Business':
        Mobile.tap(findTestObject('list.categoryBusiness'), 0)

        break
    case 'Insurance':
        Mobile.tap(findTestObject('list.categoryInsurance'), 0)

        break
    case 'Personal':
        Mobile.tap(findTestObject('list.categoryPersonal'), 0)

        break
    case 'Shopping':
        Mobile.tap(findTestObject('list.categoryShopping'), 0)

        break
    default:
        Mobile.comment('Category tidak ditemukan')}

// SAVE TASK
Mobile.tap(findTestObject('btn.saveTask'), 0)

