# Spring-Boot

## 목적
- Spring Boot 공부
- 핵심 기술에 대해 이해하고 사용하기

## 개발환경(필요사항)
|Tool|Version|
|:---:|:---:|
|Spring|Spring boot 2.1.4|
|OS|Window 10|
|IDE|IntelliJ|
|JDK|JDK 8|
|DB|MySQL|
|Build Tool|Gradle 5.4.1|

## Chapter 별로 진행

### CH1 스프링 Ioc컨테이너와 Bean
- `IoC(Inversion of Control)` : 의존 관계 주입(Dependency Injection) 이라고도 하며, 어떤 객체(Class)가 사용하는 의존 객체를 직접 만들어 사용하는 것이 아닌 주입 받아 사용하는 방법을 말함.
- 스프링이 제공하는 스프링 IoC컨테이너를 사용하는 이유 : 여러 개발자들이 스프링 커뮤니티에서 논의해서 만들어낸 여러 가지 Dependency Injection 방법과 노하우가 쌓여 있는 Framework 이기 때문이다.
- `Bean` : 컨테이너 안에 들어 있는 객체들을 빈이라 함. 컨테이너로부터 가져와서 사용할 수 있다.
- `IoC컨테이너` : IoC 기능을 하는 컨테이너
- 스프링 초기에는 XML 파일을 통해 빈을 등록하였다. 오늘날에는 어노테이션을 통해 빈을 등록하고 사용한다.
- `Bean Factory` : 최상위 인터페이스이고 Dependency Injection에 가장 핵심적인 인터페이스이다.
- `@Service` & `@Repository`로 인해 `AutoScanning`이 되어서 `Bean`으로 등록이 된다.
- `@Autowired`로 인해 의존성이 주입된다.
- 왜 IoC컨테이너가 관리를 하는가? → 의존성 주입을 위한 것도 있고, `Bean`의 스코프 때문이기도 하다
- 예를 들어 `Student`에 해당하는 `StudentService`가 있다면 굳이 여러 개일 필요가 없고, 하나만 있으면 되는데 이것을 싱글톤이라 하고, `IoC컨테이너`를 통해 만들면 훨씬 간단하다 그리고 기본적으로 싱글톤으로 등록된다.
