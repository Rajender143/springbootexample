package io.dekorate.example.sbonopenshift;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties
public class DemoProperties {
//@Value("${demo.environment}")
private String environment;
public String getEnvironment() {
	return environment;
}
public void setEnvironment(String environment) {
	this.environment = environment;
}
public String getHosts() {
	return hosts;
}
public void setHosts(String hosts) {
	this.hosts = hosts;
}
//@Value("${demo.hosts}")
private String hosts;
}
