# RRS(Restaurant-Reservation-System)


## [블로그 주소 : drsggg.tistory.com](https://drsggg.tistory.com/category/%282020%29%20%EC%82%AC%EC%9D%B4%EB%93%9C%20%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8/%28%EC%98%88%EC%A0%95%29RRS%28%EA%B2%8C%EC%8B%9C%ED%8C%90-SpringBoot%29)

### 프로젝트명 : Restaurant-Reservation-System

### 내용 : 레스토랑 예약 사이트 만들기
* 사용자는 고객, 가게, 관리자 로 기대한다.
* 고객은 뭘 먹고 싶은지 발견 할 수 있또록 가게 목록을 볼 수 있다
* 고객은 정확히 먹고 싶은게 뭔지 확인하기 위해 가게의 메뉴를 볼 수 있다.
* 고객은 좋은 가게인지 알 수 있도록 평점을 확인할 수 있다.
* 고객은 선택의 폭을 좁히기 위해 가게 목록을 분류에 따라 볼 수 있다.
* 고객은 나와 남을 위해 가게에 평점과 리뷰를 남길 수 있다.
* 고객은 나중에 찾아보기 쉽도록 가게를 즐겨찾기에 추가할 수 있다.
* 고객은 가게에서 기다리지 않기 위해 가게에 인원, 메뉴를 예약할 수 있다.
* 가게는 관심있는 고객을 받기 위해 예약 요청을 볼 수 있다.
* 가게는 더 나은 고객 서비스를 위해 예약 요청에 응답할 수 있다.
* 관리자는 고객이 서비스를 쓸 수 있도록 가게 정보를 등록할 수 있다.
* 기타 등등

### 소프트웨어 아키텍처 패턴 : 
* 계층화 패턴 (Layered pattern) 을 이용하여 3티어 아키텍처 모델로 만들 예정.
* 3티어 아키텍처 : 프레젠테이션 계층(Frontend : HTML/CSS/JS) - 비즈니스 계층(Backend : REST API) - 데이터 접근 계층(DB : DBMS)
* 이 중 비즈니스 계층(Backend)에 집중함

 

### ** 참고 : 

계층화 패턴이란? (Layered pattern)
이 패턴은 n-티어 아키텍쳐 패턴이라고도 불린다. 이는 하위 모듈들의 그룹으로 나눌 수 있는 구조화된 프로그램에서 사용할 수 있다. 각 하위 모듈들은 특정한 수준의 추상화를 제공한다. 각 계층은 다음 상위 계층에 서비스를 제공한다.

일반적인 정보 시스템에서 공통적으로 볼 수 있는 계층 4가지는 다음과 같다.

* 프레젠테이션 계층 (Presentation layer) - UI 계층 (UI layer) 이라고도 함
* 애플리케이션 계층 (Application layer) - 서비스 계층 (Service layer) 이라고도 함
* 비즈니스 논리 계층 (Business logic layer) - 도메인 계층 (Domain layer) 이라고도 함
* 데이터 접근 계층 (Data access layer) - 영속 계층 (Persistence layer) 이라고도 함

활용
* 일반적인 데스크톱 애플리케이션
* E-commerce 웹 애플리케이션

![Layered pattern image](./images/Layered-pattern-image.png)




### 사용기술 : 
* Java
* REST API
* SpringBoot
* IntelliJ, Gradle, Lombok, JPA
* Git, GitHub
