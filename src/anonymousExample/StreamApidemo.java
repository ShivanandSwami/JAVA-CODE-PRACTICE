package anonymousExample;

import java.util.ArrayList;
import java.util.List;

class Product{
	int id;
	int price;
	String name;
	int quantity;
	Product(int id,int price,String name,int quantity){
		this.id=id;
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", price=" + price + ", name=" + name + ", quantity=" + quantity + "]";
	}
}
public class StreamApidemo {

	public static void main(String[] args) {
		Product p=new Product(101,8000,"HeadPhones",2);
		List<Product> productList=new ArrayList<Product>();
		productList.add(new Product(101,8000,"HeadPhones",2));
		productList.add(new Product(102,5000,"Power Bank",3));
		productList.add(new Product(103,60000,"HP Laptop",1));
		productList.add(new Product(104,50000,"MacBook",1));
		List<Product> result=productList.stream().filter(productlist->productlist.price>30000).toList();
		List<Product> name =productList.stream().filter(productlist->productlist.name.length()>3).toList();
		System.out.println(result);
		System.out.println(name);
	}

}