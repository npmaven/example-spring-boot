yieldUnescaped '<!DOCTYPE html>'
html {
    head {
        title('Spring Boot - Groovy templates example')
        script(type: 'text/javascript', src: '/npmaven/jquery/dist/jquery.js'){}
        style {
            yieldUnescaped '''
                .hidden {
                  display: none;
                }
                body {
                  font-family: Helvetica, Arial;
                  color: #555;
                  text-align: center;
                  margin: 0;
                  padding-top: 3em;
                }
                .clickable, a {
                  color: #080;
                  text-decoration: none
                }
                .clickable:hover, a:hover {
                  cursor: pointer;
                  color: #088;
                }
            '''
        }
    }

    body {
        h1('Hello starnger. ')
        span(id: 'toggle', class: 'clickable', 'Click me, please.')
        h2(class: 'hidden') {
          yield('I was toggled by jQuery brought to you by ')
          a(href: 'http://npmaven.org')
          yield('! Woohoo!')
        }
        script {
          yieldUnescaped '''
            $(document).ready(function () {
              var $target = $('.hidden');
              $('#toggle').on('click', function () {
                $target.toggle();
              });
            });
          '''
        }
    }
}