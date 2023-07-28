# Spring Security 6 custom user with a custom datastore example (JPA)
This project was created to showcase how to override the default User class that implements UserDetails of 
Spring Security. The database used is H2 for simplicity but you can use any other database.
The JDK is Java 17.

## Testing
* A test user has been set up in the `resources/data.sql` file.  
* The users credentials are `user:password`, you can use the basic Authorization header `Basic 
dXNlcjpwYXNzd29yZA==`  
* The protected endpoint is at `/hello`.

```shell
curl --location 'http://localhost:8080/hello' \
--header 'Authorization: Basic dXNlcjpwYXNzd29yZA=='
```
## References
* https://docs.spring.io/spring-security/reference/servlet/authentication/passwords/storage.html
* https://docs.spring.io/spring-security/reference/servlet/authentication/passwords/user-details-service.html
* https://docs.spring.io/spring-security/reference/servlet/authentication/passwords/user-details.html