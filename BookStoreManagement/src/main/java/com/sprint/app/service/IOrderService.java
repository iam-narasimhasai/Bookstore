//package com.sprint.app.service;
//
//import java.util.List;
//
//import org.springframework.stereotype.Service;
//
//import com.sprint.app.dto.CustomerBasicInfoDTO;
//import com.sprint.app.dto.OrderDTO;
//import com.sprint.app.entity.Book;
//import com.sprint.app.entity.OrderDetails;
//import com.sprint.app.entity.PlaceOrder;
//import com.sprint.app.exception.OrderNotFoundException;
//
//@Service
//public interface IOrderService {
//	
//	public CustomerBasicInfoDTO getCustomerByOrderId(int orderId);
//	public List<PlaceOrder> getCustomerOrdersList(int customerId);
//	public List<OrderDetails> getAllOrders();
//	public List<Book> getOrderedBooksByOrderId(int id);
//	public OrderDetails getOrderDetailsById(int orderId)throws OrderNotFoundException;
//	public OrderDTO placeOrder(PlaceOrder p, int customerId);
//	
//}
