# Spring Boot Blog Project

_We will be utilizing an MVC design pattern to implement a Spring Boot Blog application._

## Configuration

First we need to make some additions to `application.properties`. These will alllow us to enable our H2 console, access it, and set credentials:

```
# allows us to interact with the database
spring.h2.console.enabled=true
spring.h2.console.path=/console
spring.datasource.url=jdbc:h2:mem:testdb
# keep data persistent as a file 👇
# spring.datasource.url=jdbc:h2:file:~/db
spring.datasource.platform=h2
spring.datasource.username=sa
spring.datasource.password=
```

You can have h2 write to a dedicated file but we can set up our projects such that it keeps our database _in memory_. Bear in mind that this database is volatile and will be erased once the application shuts down.

After your configuration, create the following packages in the base of your project (wherever your main/entrypoint class is located):

- `controller`
- `model`
- `repo`

## The Model

Since we're implementing a blog, it makes sense to create a `BlogPost` model. This model will have the following fields:

```java

private Long id;
private String title;
private String author;
private String blogEntry;
    
```

Generate a default constructor, a constructor with everything except `id`, and getters and setters. Additionally, override `.toString()`.

Above your `id` field, add the following annotations:

```java

    // @GeneratedValue is used to autogenerate of said keys
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

```
Lastly, add `@Entity` above your class definition.

## The Repository

Our repository will serve as an abstraction layer for us to manipulate data in our database. We should only be considered with defining the repository and any relevant methods we may need. Create an interface under `repo` named `BlogPostRepository` and build it out as such:

```java
// Long is a type
// its a wrapper class that represents your id
// anything in the diamond is known as a generic or type parameters
@Repository
public interface BlogPostRepository extends CrudRepository<BlogPost, Long> {

}
```

`CrudRepository` is providing us with method definitions that will serve as the way we interact with our database. All we need to do is extend it and define the type and id type of our model. Since we're handling `BlogPost`s, we can pass in `BlogPost` for `T`. Since the `id` on `BlogPost` is of type `Long`, we can pass in long for `ID`. Note that generics do not accept primitive types.

## The Controller

Now we need to build our controller. In the package `controller`, create a new class named `BlogPostController`. This class will handle all the routing, requests, and responses for our application's `BlogPost` model. 

## View

For the view we will be utilizing thymeleaf. Recall that thymeleaf is a templating solution to render data in an HTML file from our back end. Since we are utilizing templates, we will need to create our pages under `resources/templates`. There, create a directory named `blogpost`. Inside of `blogpost`, create two html files: `index` and `result`. Add `@Controller` onto your class definition and implement the following code:

```java
    private BlogPostRepository blogPostRepository;

    // below is a constructor based dependency injection
    // if you only have one dependency, this is considered best practice
    public BlogPostController(BlogPostRepository blogPostRepository ) {
        this.blogPostRepository = blogPostRepository;
    }
```

Above is an example of dependency injection. `@Autowired` is not needed when we are utilizing only _one_ dependency with a constructor based injection. 

Now we add our methods for to resolve our views and perform a `post`:

```java
    @GetMapping("/")
    public String index(BlogPost blogPost) {
        // since we are utilizing thymeleaf
        // our output will be generated in a template
        // returning a reference to said template
        // will allow us to show the data that we want
        return "blogpost/index";
    }

    // this is where we are mapping our post request in our project
    @PostMapping("/")
    public String addNewBlogPost(BlogPost blogPost, Model model) {
        // blogPost from our parameter is the object we're getting from
        // the thymeleaf form, we can simple save it in our repository
        blogPostRepository.save(blogPost);
        model.addAttribute("title",blogPost.getTitle());
        model.addAttribute("author",blogPost.getAuthor());
        model.addAttribute("blogEntry",blogPost.getBlogEntry());
        return "blogpost/result";
    }
```

`index.html` will look like so:

```html
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Blog Site</title>
</head>
<body>

<h1>Welcome to our blog post site!</h1>
<h3>Check out our blogs!</h3>

<form action="#" th:action="@{/}" th:object="${blogPost}" method="post">
    <table>
        <tr>
            <td>Title</td>
            <td><input type="text" th:field="*{title}"/></td>
        </tr>
        <tr>
            <td>Author</td>
            <td><input type="text" th:field="*{author}"/></td>
        </tr>
        <tr>
            <td>Blog Entry</td>
            <td><input type="text" th:field="*{blogEntry}"/></td>
        </tr>
        <tr>
            <td>
                <button type="submit">Submit your Post</button>
            </td>
        </tr>
    </table>
</form>

</body>
</html>
```

Additionally, `result.html` will look like so:

```html
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Blog Site</title>
</head>
<body>
    <h3>Blog Post Form</h3>
    <p>Thank you for your submission!</p>
    <h4>Blog Post: </h4>
    <p th:text="${title}" />
    <p th:text="${author}" />
    <p th:text="${blogEntry}" />
</body>
</html>
```

## Test

Hello world. I like to [Google][1].

## Links

- [1]: http:google.com "Google"
- [Baeldung: Properties with Spring](https://www.baeldung.com/properties-with-spring)
- [Baeldung: Spring-Boot H2 Database](https://www.baeldung.com/spring-boot-h2-database)

[comment]: <> (find likn)