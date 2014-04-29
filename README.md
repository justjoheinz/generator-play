# yoplay!

A Yeoman generator to bootstrap and improve Play! applications with integration of the `sbt-yo` plugin, giving you yo, bower and grunt in the sbt console.

## Credits

- [pauldijou/generator-play](https://github.com/pauldijou/generator-play)
- [play-yeoman](https://github.com/tuplejump/play-yeoman)

## Getting started
This project is a fork of [pauldijou/generator-play](https://github.com/pauldijou/generator-play) and not officially released yet. It also uses [play-yeoman](https://github.com/tuplejump/play-yeoman) behind the scenes.

- Clone this repository
   ```git clone https://github.com/justjoheinz/generator-play.git```
- cd into the new directoy
   ```cd generator-play``` 
- Link your local installation with yeoman
   ```npm link```
- Create a new project directory for your play project
  ```
  ~/test$ yo play
                    _             _ 
                   | |           | |
  _   _  ___  _ __ | | __ _ _   _| |
 | | | |/ _ \| '_ \| |/ _` | | | | |
 | |_| | (_) | |_) | | (_| | |_| |_|
  \__, |\___/| .__/|_|\__,_|\__, (_)
   __/ |     | |             __/ |  
  |___/      |_|            |___/   


     info Looking for your template at the following paths:
     info   local  /Users/markusklink/Projects/web/generator-play/app/templates/new
     info   remote https://github.com/generator-template/new
     info 
     info Filtering paths...
  ```
- answer the questions and after you did set up your play project (with all the work automatically done as decribed in `play-yeoman`, you can install your UI part using yeoman with sbt: First run ```update```, followed by ```yo angular``` or ```yo reactjs``` or any other project template you desire in the sbt console.
- You still need to uncomment the `connect` line in `ui/Gruntfile.js`:
  ```
    grunt.task.run([
      'clean:server',
      'bowerInstall',
      'concurrent:server',
      'autoprefixer',
    //      'connect:livereload',                                                   
      'watch'
    ]);
  ``` as described in [play-yeoman](https://github.com/tuplejump/play-yeoman)

## Gotchas

Sometimes yo/bower/grunt fail within the sbt console. The reason is frequently, that those command want to take over the console, in order to get user feedback. One common scenario occurs when you try to install dependencies with ```bower install foo --save``` and there is a conflict. You will see ```ECONFLICT Unable to find suitable version for foo```. Simply quit sbt, ```cd ui``` and run your command from there, to see if that resolves the issue.


## License
[MIT License](http://en.wikipedia.org/wiki/MIT_License)
