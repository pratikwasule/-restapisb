package maxi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringRestController {
	//http://localhost:8080/SpringRestAPI/data http://localhost:8080/SpringRestAPI/
 	@RequestMapping(value="/data", method=RequestMethod.GET)
	public @ResponseBody String  getDetails(@RequestParam("rol") String rol) throws JsonGenerationException, JsonMappingException, IOException
	{
		System.out.println("okkkk ");
	
		List<User> list = getData(rol);
		System.out.println("lst "+list.size());
		ObjectMapper m = new ObjectMapper();
		String strjson = m.writeValueAsString(list);
		return strjson;
	}
	
	@RequestMapping(value="/data1", method=RequestMethod.GET)
	public @ResponseBody String  getDetails1(@RequestParam("rol") String rol) throws JsonGenerationException, JsonMappingException, IOException
	{
		System.out.println("okkkk ");
	
		List<User> list = getData(rol+" hi");
		System.out.println("lst "+list.size());
		ObjectMapper m = new ObjectMapper();
		String strjson = m.writeValueAsString(list);
		return strjson;
	}
	
	
	
	
	private List<User> getData(String rol)
	{
		List<User> l=new ArrayList<User>();
		User u = new User();
		u.setRoll(rol);
		u.setName("swaraj");
		u.setAdd("amravati");
		l.add(u);
		
		User u1 = new User();
		u1.setRoll("1033");
		u1.setName("kartik");
		u1.setAdd("pune");
		l.add(u1);
		
		User u2 = new User();
		u2.setRoll("2223");
		u2.setName("kanha");
		u2.setAdd("jarud");
		l.add(u2); 
		
		User u3 = new User();
		u3.setRoll("1111");
		u3.setName("pratik");
		u3.setAdd("nagpur");
		l.add(u3);
		
		User u4 = new User();
		u4.setRoll("100");
		u4.setName("viru");
		u4.setAdd("amravati");
		l.add(u4);
		
		User u5 = new User();
		u5.setRoll("10");
		u5.setName("manthan");
		u5.setAdd("warud");
		l.add(u5);
		
		User u6 = new User();
		u6.setRoll("8798");
		u6.setName("dadu");
		u6.setAdd("mumbai");
		l.add(u6);
		
		
		return l;
		 
		 
		
	}


}
