//package com.sprint.app.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.sprint.app.dto.CustomerBasicInfoDTO;
//import com.sprint.app.dto.CustomerBasicInfoDTOConversion;
//import com.sprint.app.dto.OrderDTO;
//import com.sprint.app.dto.OrderDTOConversion;
//import com.sprint.app.entity.Book;
//import com.sprint.app.entity.Customer;
//import com.sprint.app.entity.OrderDetails;
//import com.sprint.app.entity.PlaceOrder;
//import com.sprint.app.repository.ICustomerServiceRepo;
//import com.sprint.app.repository.IOrderRepository;
//import com.sprint.app.repository.IPlaceOrderRepository;
//
//@Service
//public class OrderServiceImpl implements IOrderService{
//
//	@Autowired
//	ICustomerServiceRepo customerService;
//	
//	@Autowired
//	IOrderRepository odrepo;
//	
//	@Autowired
//	IPlaceOrderRepository porepo;
//	
//	@Override
//	public CustomerBasicInfoDTO getCustomerByOrderId(int orderId) {
//		
//		int custId=odrepo.findById(orderId).get().getCustomerId();
//		
//		Customer c=customerService.findById(custId).get();
//		
//		CustomerBasicInfoDTOConversion dto=new CustomerBasicInfoDTOConversion();
//		return dto.convertCustomer(c);
//		
//	}
//	
//
//	public List<PlaceOrder> getCustomerOrdersList(int customerId) {
//		
//		Customer c=new Customer();
//		
//		c=customerService.findById(customerId).get();
//		
//		List<PlaceOrder> ordersList=c.getOrdersList();
//		
//		return ordersList;
//	}
//
//
//	@Override
//	//(Method to retrieve all orders)
//	public List<OrderDetails> getAllOrders() {
//		
//		List<OrderDetails> od=(List<OrderDetails>) odrepo.findAll();
//		
//		return od;
//	}
//
//
//	@Override
//	public List<Book> getOrderedBooksByOrderId(int id) {
//		
//		return null;
//		
//	}
//
//
//	@Override
//	public OrderDetails getOrderDetailsById(int orderId) {
//		
//		return odrepo.findById(orderId).get();
//	}
//
//
//	@Override
//	public OrderDTO placeOrder(PlaceOrder p,int customerId) {
//		
//		porepo.save(p);
//		List<Book> list=p.getBooksList();
//		int total=0;
//		for(Book b:list) {
//			total+=b.getPrice();
//		}
//	
//		
//		Customer c=customerService.findById(customerId).get();
//		
//		OrderDetails od=new OrderDetails();
//		od.setCustomerId(c.getCustomerId());
//		od.setCustomerMobile(c.getMobileNumber());
//		od.setCustomerName(c.getFullName());
//		od.setOrderId(p.getOrderId());
//		od.setOrderStatus("Ordered");
//		od.setTotalPrice(total);
//		od.setQuantity(list.size());
//		
//		odrepo.save(od);
//		
//		
//		OrderDTOConversion dto=new OrderDTOConversion();
//		
//		return dto.convertToDTO(p);
//	}
//}
