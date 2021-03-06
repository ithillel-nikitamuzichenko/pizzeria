package ua.opu.dl.pizzeria.dao;

import java.util.List;


import ua.opu.dl.pizzeria.model.Order;

public interface OrderDao {
	void addOrder(Order order);

	void updateOrder(Order order);

	void deleteOrder(Order order);

	Order loadById(Integer id);

	List<Order> loadAllOrders();
}
