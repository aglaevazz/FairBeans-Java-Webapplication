# FairBeans Web Application *[in development]*

### Description:
This is a web application for the fictitious company FairBeans which distributes biological fair trade coffee beans.
The application connects to a database where products and distribution partners are stored. Partners and products are mapped by a many to many relationship. Partners can be searched by zipcode or city and displayed with the products they sell. This project is the base for a new enterprise. The real purpose is hidden to protect the new company until launch.

### Todo:
* Add functionality to add products and partners.
* Add login for managers to access this functionality.
* Add login for partners to display their current contract and request changes, etc.
* Display partners in Google Maps plugin.
* Improve design and text.
* Add integration tests for controller layer and repository layer

### Technologies used:
* Java 15
* Spring Boot
* JPA & Hibernate
* PostgreSQL
* Maven
* Google Maps: Maps JavaScript API
* bootstrap (used a free template from [quackit.com](https://www.quackit.com/html/templates/))
* thymeleaf


### Demo:
![demo image](/src/main/resources/static/images/home-demo-1.png)
![demo image](/src/main/resources/static/images/home-demo-2.png)
![demo image](/src/main/resources/static/images/home-demo-3.png)
![demo image](src/main/resources/static/images/home-demo-4.png)
![demo image](/src/main/resources/static/images/partners-demo.png)
