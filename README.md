# jpa_join_project


## Table 구조
### DEPT
![image](https://github.com/user-attachments/assets/b40951fb-19cf-4f76-a79a-ce5ae540f685)
### EMP
![image](https://github.com/user-attachments/assets/468154c2-0efc-4ed9-a354-71130dc7245f)

### 문제 현상
![image](https://github.com/user-attachments/assets/ee50428b-0fbf-433c-9b0e-5285a6ee4354)

#### 원인 : @ToString을 통해 dept와 emp간의 무한 참조가 발생하여 스택 오버 플로우 현상이 발생
#### 해결 : @Tostring 코드 삭제 

### 결과
![image](https://github.com/user-attachments/assets/82cf354a-c854-4570-8457-0fb37e2dbee2)
