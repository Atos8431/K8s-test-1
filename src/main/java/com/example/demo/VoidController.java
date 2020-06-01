package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@CrossOrigin("*")
@Controller
public class VoidController {
	
	@GetMapping("/{color1}/{color2}")
	public ResponseEntity<String> Tricolor(@PathVariable int color1 ,@PathVariable int color2) {
		//红色 = 1  黄色 = 2  蓝色 = 3  橙色 = 4  紫色 = 5  绿色 = 6
		if((color1 == 1 && color2 == 2) || (color2 == 1 && color1 == 2)) {
			return ResponseEntity.status(HttpStatus.CREATED).body("橙色");
		}
		else if((color1 == 1 && color2 == 3) || (color2 == 1 && color1 == 3)) {
			return ResponseEntity.status(HttpStatus.CREATED).body("紫色");
		}
		else if((color1 == 2 && color2 == 3) || (color2 == 2 && color1 == 3)) {
			return ResponseEntity.status(HttpStatus.CREATED).body("绿色");
		}
		else {
			return ResponseEntity.status(HttpStatus.CREATED).body("颜色不能识别");
		}
	}
}
