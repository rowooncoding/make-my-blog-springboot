# 🍃 스프링 부트 공부하면서 블로그 만들기!!

## 🚀 Versions
- JDK : 17
- Spring Boot : 3.1.7

## 🚀 Dependency
- lombok
- h2
- Spring data JPA
- Thymeleaf

## 💻 CI/CD
- AWS
- GitHub Action

## 📋 Entity
| 컬럼명 | 자료형 | null 허용 | 키 | 설명 |
| --- | --- | --- | --- | --- |
| id | BIGINT | N | 기본키 | 일련번호, 기본키 |
| title | VARCHAR(255) | N |  | 게시물의 제목 |
| content | VARCHAR(255) | N |  | 내용 |


| 컬럼명 | 자료형 | null 허용 | 키 | 설명 |
| --- | --- | --- | --- | --- |
| id | bigint | n | 기본키 | 일련번호, 기본키 |
| email | varchar(255) | n |  | 이메일 |
| password | varchar(255) | n |  | 패스워드(암호화하여 저장 |
| created_at | datetime | n |  | 생성일자 |
| updated_at | datetime | n |  | 수정일자 |

| 컬럼명 | 자료형 | null 허용 | 키 | 설명 |
| --- | --- | --- | --- | --- |
| id | bigint | n | pk | 일련번호, 기본키 |
| user_id | bigint | n |  | 유저 ID |
| refresh_token | varchar(255) | n |  | 토큰값 |

## 💣 에러슈팅

> issue 페이지에 가셔도 볼 수 있습니다.
 
<li>
  <a href="https://github.com/rowooncoding/make-my-blog-springboot/issues/1">PropertyValueException<a>  
</li>
<li>
  <a href="https://github.com/rowooncoding/make-my-blog-springboot/issues/2">TemplateProcessingException, SpelEvaluationException<a>  
</li>
    
---

## 👀 목차
### 블로그 기획 및 API 만들기
- 엔티티 구성
- 레포지토리 구성
- 글 작성 API
- 글 목록 조회 API
- 블로그 글 조회 API
- 볼로그 글 삭제 API
- 볼로그 글 수정 API
### 볼로그 화면 구성
- 글 목록 뷰 구현
- 상세 글 뷰 구현
- 삭제 기능 추가
- 수정 / 글 작성 기능 추가
- 생성 기능 마무리
### 스프링 시큐리티
- 회원 도메인 생성
- 시큐리티 설정
- 회원가입 구현
- 회원가입, 로그인 뷰 작성
- 로그아웃 구현
- 실행 테스트
### JWT로 로그인/로그아웃 구현
- JWT 서비스 구현
- 토큰 API 구현
### OAuth2
- 토큰 발급
- 적용
- 실행 테스트
