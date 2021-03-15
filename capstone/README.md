# Capstone Project

_Welcome to the end of the course! You will now create an application that will serve as your capstone project. Think of it as your thesis statement. It should present everything that you've learned so far in a concise and simple manner._ 

## Setup

The project can be done in teams or in groups. The project will have to meet certain constraints that will be outlined below. We would like to see some creativity, but a simple showcase of your talent is more than appreciated! The project is due on the day you're presenting. Presentations will be on Thurday the 18th and Friday the 19th of March. You will have all day to work on your project. It is due on the day you present so try to have it up and running by Thursday! 

## Constraints 

- Incorporate all of the CRUD operations (Create, Read, Update, and Delete). 
- Include front-end styling/css. You can use a css library like Bootstap.
- Include a functioning backend that can make API calls. You can implement a database with RESTful endpoints. 
- Be deployed and accessible via a web-link (the data does not have to be persistent).
- **OPTIONAL**: Include some sort of third party API call (Google Maps, Weather, etc...).
- Use Spring Security or any security solution such as OAuth. 

## Outline

### 1. Ideation

You should create a solid foundation for your project before writing a single line of code. See if you can pitch your project in a single sentence. Then get to brainstorming! What should the project do? What's the use case? Who's it for? What are the tools you will use? What are the dependencies for the project? What are your constraints? Write this all down and share it with your team if you have one! 

> - Thesis: An application that tracks a user's habits. 
> - This project will track a user's habits and encourages daily tracking via alerts.
> - This project will be built with Spring Boot for the backend and React for the frontend.  

Once you have your foundation, expand on how you will solve any given problem that your project may want to solve. Tackle the biggest problems with the clearest solutions. Again, write these down and use them as the basis for your application. These will serve as your application's features. 

> - User accounts to keep track of input data. 
> - Daily alerts to encourage tracking of habits.
> - Smart wellness AI that intrepets user data.
> - Social functionality that allows users to share and discuss their habit tracking. 

### 2. Modeling

You should have a solid outline of your project in text. Now, try to have a visual representation of your project's architecture that is as informative as possible. Diagram your packages and classes with the associated methods and fields. Define relationships in your code between classes and objects. These drawings will serve as a helpful representation of your project.

```
User Class
------
private Long id; 
private String username;
private List<Habit> HabitList; 


Habit Class
------
private Long id;
private String description; 
private User associatedUser; 

```

### 3. Implementation

Start writing out your code! Test your code as often as possible to make sure everything is working as intended. It is recommended that you write JUnit test cases wherever possible, but you will not be graded on this. 

### 4. Deployment and Presentation

Pick a hosting solution and deploy your application. It should be easily accesible by anyone with internet access. Once its deployed, you can easily present your application!

### OPTIONAL: Persistent Database

Via a hosting solution such as Heroku, you are given the ability to utilize a persistent database. Check the link belows for an offical guide on the topic. Here I will outline the basics steps you'll need to employ in order to have a persisent database online via Heroku.

1. Create a project via Spring Initializer. [Here is a link to my starter project with all of the appropiate dependencies](https://start.spring.io/#!type=gradle-project&language=java&platformVersion=2.4.3.RELEASE&packaging=jar&jvmVersion=11&groupId=com.tts&artifactId=hosted-database&name=hosted-database&description=Heroku%20Spring%20Boot%20sample%20application%20with%20database&packageName=com.tts.hosted-database&dependencies=postgresql,data-jpa,web). Set up a standard MVC with at least one endpoint that creates and saves an entity. Have that endpoint return the same entity. 

2. As long as you have the postgres dependency, you are able to set up the heroku plugin and have it work with little configuration. Set up an application on heroku. Go to your application's overview page and navigate to the "resources" page. Under add-ons, search for Heroku Postgres and click on "Submit Order Form". Your application now has a bespoke database!

3. Navigate to your endpoint. In your application.properties, make sure you have `spring.jpa.hibernate.ddl-auto=${SPRING_JPA_HIBERNATE_DDL-AUTO}` if your endpoint isn't working.   

## Resources

- [Heroku: Get Started with Java](https://devcenter.heroku.com/articles/getting-started-with-java)
- [Sprint Book](https://www.thesprintbook.com/)

