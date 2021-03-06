/**
 * Copyright 2018 The original authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.dekorate.example.sbonopenshift;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@ConfigurationProperties("spring.application.name.demo")
public class Controller {

	@Autowired
	private DemoProperties prop;
	
	@Autowired
	private Platform platform;
	
  @RequestMapping("/loginTest")
  public ModelAndView hello(ModelAndView mv) {
	  System.out.println("Entered into login method"+"Environment  :"+prop.getEnvironment()+"Host  :"+prop.getHosts());
	  System.out.println("platform  :"+platform.getDomainUrl().getBaseUrl());
	  mv.addObject("platform", platform.getDomainUrl().getBaseUrl());
	  mv.setViewName("welcome");
	return mv;
	  
  }
}
