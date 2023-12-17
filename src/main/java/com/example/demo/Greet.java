package com.example.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greet {
	@GetMapping("/greet")
	public String ok () {
		String ip=null;
		try {
			ip=InetAddress.getLocalHost().getHostAddress();
					
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return "Hi" + ip ;
	}

}
