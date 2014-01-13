package ua.opu.dl.pizzeria.service;

import java.util.List;

import ua.opu.dl.pizzeria.model.Order;

public interface OrderServise {
	void addOrder(Order order);

	void updateOrder(Order order);

	void deleteOrder(Order order);

	Order loadById(Integer id);

	List<Order> loadAllOrder();
}