yieldUnescaped '<!DOCTYPE html>'
html {
    head {
        title('Spring Boot - Groovy templates example')
        script(type: 'text/javascript', src: '/npmaven/angular/angular.js'){}
    }

    body {
        div(class: 'container') {
            div("This is an application using Groovy templates $groovyVersion")
        }
    }
}