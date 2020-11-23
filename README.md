# 주차장 관리 프로그램


## 승용차, 버스, 트럭 세 가지 종류의 차량이 주차 가능


### 승용차: 일반차, 전기차

- 공통: 최초 30분 2,000원 + 추가 10분당 1000원
- 전기차: 1KWh를 충전하는데 200원 (소수점 이하는 절삭)


### 버스: 버스의 최대 승객수에 따라 40인승 이상, 20인승~40인승, 20인승 미만

- 대형: 최초 1시간 5,000원 + 추가 30분당 3,000원
- 중형: 최초 1시간 3,000원 + 추가 30분당 2,000원
- 소형: 최초 1시간 2,000원 + 추가 30분당 1,000원


### 트럭: 트럭의 중량에 따라 10톤 이상, 10톤미만 5톤이상, 5톤 미만

- 대형: 1시간당 4,000원
- 중형: 1시간당 3,000원
- 소형: 1시간당 2,000원

## 기능

- 입차: 차량의 입차정보를 입력받아 저장한다. 차량의 입차정보는 차량번호, 차량종류, 입차시간이다.
- 출차: 출차하는 차량의 정보를 입력받아 총 요금을 계산하여 보여준다. 차량의 정보로는 차량번호와 출차시간이다
- 주차차량 조회: 주차되어 있는 모든 차량은 종류별(승용차, 버스, 트럭 순) 입차시간 순서별로 정렬하여 보여준다. 출력할 차량정보는 차량 종류, 차량번호, 입차시간을 보여준다.
- 총 수입 조회: 입차 후 출차한 차량에 대한 총 수입을 계산하여 출력한다.
