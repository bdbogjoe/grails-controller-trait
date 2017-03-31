# grails-controller-trait

Illustrate issue with controllers using traits for action having parameters
https://github.com/grails/grails-core/issues/10560


* start app
* go to http://localhost:8080/home, it will go to index view, which is ok
* go to http://localhost:8080/home/edit/1, it will go to edit view with correct model
* go to http://localhost:8080/home/show/1, it will go to show view but model is empty