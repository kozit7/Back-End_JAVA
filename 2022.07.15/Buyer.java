package People;

public class Buyer {
	// 소유금액
	int money =1000;
	Product[] item = new Product[5];
	int i = 0; //item의 인덱스 값을  i변수에 저장
	//제품을 사능 기능
	void buy(Product p) {
		// 내가 가진 금액= 내가 가진 금액 - 제품가격
		// 소유금액 = 소유금액(money) - 제품 가격
		//money = money - (p.price);
		money -= (p.price);
		System.out.println(p.toString()+"제품을 구입하셨습니다.가격은"+p.price+"입니다.");
		item[i++]=p;
	}
}
