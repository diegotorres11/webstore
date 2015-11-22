package com.packt.webstore.controller;

import java.math.BigDecimal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.packt.webstore.domain.Product;

@Controller
public class ProductController {
	
	@RequestMapping("/products")
	public String list(Model model) {
		
		Product product = new Product("HP8L", "P8 LITE", new BigDecimal(750));
		product.setDescription("Huawei p8 lite black");
		product.setCategory("Smartphone");
		product.setManufacturer("Huawei");
		product.setUnitsInStock(300);
		
		model.addAttribute("product", product);
		
		return "products";
	}
	
}
