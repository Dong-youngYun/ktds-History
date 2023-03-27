package address_book;

import java.util.ArrayList;
import java.util.List;

public class AddressListHandler {

	private List<Address> addressList = new ArrayList<>();
	
	/*
	 * byte = Byte
	 * short = Short
	 * int = Integer
	 * long = Long
	 * float = Float
	 * double = Double
	 * boolean = Boolean
	 * char = Character
	 */
	/*
	 * private List<Integer> intList = new ArrayList<>(); 
	 * private List<Double> doubleList = new ArrayList<>(); 
	 * private double[] doubleArra = new double[50];
	 */
	public void create (String name, String phoneNumber, String address) {
		Address addr =new Address();
		addr.setName(name);
		addr.setPhoneNumber(phoneNumber);
		addr.setAddress(address);
		addressList.add(addr);
	}
	
	public void update (int index,
						  String name,
						  String phoneNumber,
						  String address) {
		Address addr = addressList.get(index);
		addr.setName(name);
		addr.setPhoneNumber(phoneNumber);
		addr.setAddress(address);
	}
	
	public void delete(int index) {
		addressList.remove(index);
	}
	
	public void read(int index) {
		Address addr = addressList.get(index);
		System.out.println("이름: " + addr.getName());
		System.out.println("전화번호: " + addr.getPhoneNumber());
		System.out.println("주소: " + addr.getAddress());
	}
	/**
	 * 전통적인 for를 이용해 반복
	 */
	public void readAllFor() {
		for (int i = 0; i < addressList.size(); i+=1)
//		Address addr = addressList.get(i);
//		System.out.println("이름: " + addr.getName());
//		System.out.println("전화번호: " + addr.getPhoneNumber());
//		System.out.println("주소: " + addr.getAddress());
		//위에 이미 있어서 호출 원래는 위 내용을 써야되	
			read(i);
	}
	/**
	 * for-each를 이용해 반복
	 */
	public void readAllForeach() {
		for(Address addr: addressList) {
			System.out.println("이름: " + addr.getName());
			System.out.println("전화번호: " + addr.getPhoneNumber());
			System.out.println("주소: " + addr.getAddress());
		}
	}
	
	/**
	 * List의 forEach를 이용해 반복
	 * stream을 지원하는 반복자
	 */
	public void readAllListForeach() {
		addressList.forEach( (addr) -> {
			System.out.println("이름: " + addr.getName());
			System.out.println("전화번호: " + addr.getPhoneNumber());
			System.out.println("주소: " + addr.getAddress());
		} );
	}
	
	public static void main(String[] args) {
		AddressListHandler handler = new AddressListHandler();
		
		handler.create("조태용", "010-1234-1234", "서울");
		handler.create("이동학", "010-5678-1234", "서울");
		handler.create("이건희", "010-2345-8888", "서울");
		
		handler.read(0);
		handler.read(1);
		handler.read(2);
		
		handler.update(2,"이건희", "010-1111-2222", "서울");
		handler.read(2);
		
		handler.delete(2);
		
		
		System.out.println("FOR");
		handler.readAllFor();
		
		System.out.println("FOR-EACH");
		handler.readAllForeach();
		
		System.out.println("LIST FOR EACH");
		handler.readAllListForeach();
		
		//list 추가
//		Address addr = new Address();
//		addr.setName("윤동영");
//		handler.addressList.add(addr);
//		
//		Address addr2 = new Address();
//		addr2.setName("이동학");
//		handler.addressList.add(addr2);
//		
//		//list 조회
//		Address each = handler.addressList.get(0);
//		System.out.println(each.getName());
//		
//		each = handler.addressList.get(1);
//		System.out.println(each.getName());
//		
//		System.out.println(handler.addressList.size());
//		
//		//list 삭제
//		//handler.addressList.remove(1);
//		//handler.addressList.remove(0);
//		//handler.addressList.clear();
//		//System.out.println(handler.addressList.size());
//		
//		//list 수정
//		Address addr3 = handler.addressList.get(0);
//		addr3.setName("유경진");
//		//0번에게 할당한적이 없는데 바뀜
//		//addr3이 레퍼런스 타입으로 메모리 주소인데 그 곳에 값을 할당했기때문 get으로 가져온 주소랑 동일
//		System.out.println(handler.addressList.get(0).getName());
//		
//		/*
//		 * List<Integer> intList = new ArrayList<>(); 
//		 * intList.add(10); //0에 있는 값을 100으로수정하겟다. 근데 set키워드 쓸일이 없어 
//		 * intList.set(0,100); int a = intList.get(0); a = 100;
//		 * System.out.println(intList.get(0)); 
//		 * System.out.println(a)
//		 */ 
	}
	
}
