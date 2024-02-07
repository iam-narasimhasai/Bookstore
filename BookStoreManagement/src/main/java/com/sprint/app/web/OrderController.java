//package com.sprint.app.web;
//
//import java.util.List;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.sprint.app.dto.CustomerBasicInfoDTO;
//import com.sprint.app.dto.OrderDTO;
//import com.sprint.app.entity.OrderDetails;
//import com.sprint.app.entity.PlaceOrder;
//import com.sprint.app.exception.OrderNotFoundException;
//import com.sprint.app.service.IOrderService;
//
//@RestController
//@RequestMapping("/orders")
//public class OrderController {
//	
//	@Autowired
//	IOrderService odService;
//	
//	@GetMapping("/order")
//	public CustomerBasicInfoDTO getCustomerByOrderId(@RequestParam int id)
//	{
//		return odService.getCustomerByOrderId(id);
//	}
//	
//	
//	@GetMapping("/details")
//	public List<OrderDetails> getAllOrderDetails() {
//		
//		return odService.getAllOrders();
//	}
//	
//	@GetMapping("/customer/{customerid}")
//	public List<PlaceOrder> getCustomerAllOrders(@PathVariable int  customerid){
//		
//		return odService.getCustomerOrdersList(customerid);
//	}
//	
//	@GetMapping("/id/{orderId}")
//	public OrderDetails getOrderDetailsById(@PathVariable int orderId) throws OrderNotFoundException {
//		
//		return odService.getOrderDetailsById(orderId);
//	}
//	
//	@PostMapping("/customer/{customerId}")
//	public OrderDTO placeOrder(@RequestBody PlaceOrder p,@PathVariable int customerId) {
//		
//		return odService.placeOrder(p,customerId);
//	}
//}
