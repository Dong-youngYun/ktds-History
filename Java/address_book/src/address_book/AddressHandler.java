package address_book;


public class AddressHandler {
	
	private Address address1;
	
	/**
	 *  주소록 추가
	 */
	
	public void create() {
		address1 = new Address();
		address1.setName("윤동영");
		address1.setPhoneNumber("010-9559-6722");
		address1.setAddress("서울");
	}
	
	public void update() {
		address1.setName("동영");
	}
	
	public void delete() {
		address1 = null;
		
	}
	
	public void read() {
		System.out.println("이름:" +address1.getName());
		System.out.println("전화번호:" + address1.getPhoneNumber());
		System.out.println("주소:" +address1.getAddress());
	}
	
	public static void main(String[] args) {
		AddressHandler handler = new AddressHandler();
		handler.create();
		handler.read();
		
		handler.update();
		handler.read();
		
		handler.delete();
		//handler.read();
	}
	
}

	
