package 인터페이스_기초;

public interface Codable {
	/*
	 인터페이스
	 1. 객체 생성 불가능
	 2. 추상메소드만 가질 수 있다.
	  - java 8버전 -> default or static 키워드를 추가하면 일반 메소드도 가질 수 있다.
	 3. 필드 안에 반드시 상수만 가질 수 있다.
	 
	 클래스들이 구현해야 하는 공통되는 기능들을 미리 지정
	 작업명세서 or 프로젝트 설계도
	 기능만 정의함으로써 구현 객체의 같은 동작 보장(*구현강제)
	 */
	
	// abstract를 지워도 추상메소드로 인식함	
	public abstract void coding();
}
