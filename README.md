ColoredObjects
==============

A small project with interactive UI to play with objects and it's colors and update it's state at the server after every change.

Build,configure and run project:
----------------------------------
This is a maven project.So in order to run the project you need maven installed in your machin.un command 'mvn package' to bundle 
the war file and deploy it into your server like tomcat. Access the client UI at http://localhost:8080/platform_9.index.html, with your port number varying.


Description of Tools, frameworks  and Programming Language :
-----------------------------------------------------------
1.Back end :
Programming Language : 
Java is used to write the web service.
Framework : 
Jersey-2.8 is used to create web service to retrieve the  objects, change their colors and update colors.
Libraries:
JSON – Json objects are used to send and back data to and fro UI  and back end.

2.Frond end :
3 columns are rendered red, blue and green initially to retrieve all the objects in the intial colos.
Html, css is used to render the basic UI.
jQuery sortable Is used to build the drag and drop structure of the objects  into respective columns.
After every drag and drop, ajax is called, to update colors at the backend without page refresh.
This call is bound in ‘receive’ function of jQuery sortable, so that it calls ajax when new object is received in the columns.

3.Packaging application:
Maven is used to bundle the web app and package the application into war file.

4.Flow :
1.Initially the “getdata” the method is called document.ready function which accesses the endpoint ‘getAll' of web service.
2.To update the changed color, Ajax call in the receive function of jQuery sortable calls the endpoint ‘updateColor’ of web service.


