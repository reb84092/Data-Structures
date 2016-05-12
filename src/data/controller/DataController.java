package data.controller;

import java.util.Queue;
import java.util.Stack;
import data.model.*;

public class DataController
{
	private Queue<Customer> customerQueue;
	private Stack<Dish> dishes;
	
	private void start()
	{
		doStuffToDishes();
		useTheCustomerQueue();
	}
	private void doStuffToDishes()
	{
		dishes = new Stack<Dish>();
		
	}
}
