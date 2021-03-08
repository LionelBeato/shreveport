# Authentication - 02/09/2021

_In Spring, there are many ways to implement authentication. Not only does Spring have its own security implementation, but it has access to third-party solutions as well. We'll be covering the solution known as OAuth._



## Spring Security

Spring Security is a first-party solution for authentication provided as a dependency.

> Spring Security is a powerful and highly customizable authentication and access-control framework. It is the de-facto standard for securing Spring-based applications.
> Spring Security is a framework that focuses on providing both authentication and authorization to Java applications. Like all Spring projects, the real power of Spring Security is found in how easily it can be extended to meet custom requirements

Given that Spring Security is a configuration detail of our application, it only makes sense to establish any concrete code for it in a `config` package. This is true for most--if not all--configuration details.

## OAuth

OAuth is an authentication platform that allows you to login to services with established credentials under another platform. Utilizing the OAuth dependency, we can allow spring to plug into our authentication service platform of choice. The provided project example utilizes GitHub as the credentials provider. 


## Links

-[Spring: Spring Security](https://spring.io/projects/spring-security)
-[Spring: OAuth2 Tutorial](https://spring.io/guides/tutorials/spring-boot-oauth2/)
