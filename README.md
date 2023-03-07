# Pre-Requirements

<groupId>io.github.bonigarcia</groupId>
<artifactId>webdrivermanager</artifactId>

<groupId>org.seleniumhq.selenium</groupId>
<artifactId>selenium-java</artifactId>

# Driver creation

WebDriverManager.chromedriver().browserInDocker().setup();
ChromeOptions opts = new ChromeOptions();
opts.addArguments("--headless", "--disable-dev-shm-usage", "--no-sandbox");