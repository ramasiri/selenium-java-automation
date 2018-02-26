package tests.step.definition

import tests.step.pages.*

public class webdriverMethods {

public static String testname;
public static RemoteWebDriver driver;
public static ThreadLocal<String> sessionId = new ThreadLocal<String>();
public static Properties prop = new Properties();
public static String browsename;
public static String browsername;
public static String host_url;
public static String url;
public static URL;
public static FileInputStream fp;
public static LoginPage loginpage;
public static boolean saucelabsTestStatus = true;


public RemoteWebDriver setBrowser() throws IOException {

DesireCapabilities caps = null;

readProperties();

if(browsername.equals("firefox"))
{
testname = "JobName_in_Firefox";
caps = DesiredCapabilities.firefox();
caps.setCapability("platform", "macOS 10.12");
caps.setCapability("version", "55.0");
caps.setCapability("name",testname);
}

else if(browsername.equals("local")){

System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/drivers/chromedriver");
if(driver==null)
driver = new ChromeDriver();
}

else

{
caps = DesiredCapabilities.chrome();
caps.setCapability("platform", "macOS 10.12");
caps.setCapability("version", "59.0");
}

if (!browsername.equals("local"))
    if(driver==null)
    
    {
    
    driver = new RemoteWebDriver(new URL(URL) , caps);
    String id = driver.getSessionId().toString();
    sessionId.set(id);
    }
    initializePageObjects();
    driver.manage().timeouts.implicitlyWait(20, TimeUnit.SECONDS);
    return driver;
    
    }
    
    public String getSessionId(){
    return sessionId.get();
    }
    
    public void readProperties() throws IOException{
    
    fp = new FileInputStream("src//main//resources//project.properties");
    
    prop.load(fp);
    browsername = prop.getProperty("browsername");
    host_url = prop.getProperty("url");
    URL = prop.getProperty("saucelabsurl");
    
    }
    
    public void initializePageObjects(){
    
    login = new LoginPage();
    }
    }

