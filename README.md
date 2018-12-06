# Robot Framework Java Library 
### (custom-made library, using Java, to be used on RobotFramework)


#### Prerequisites for using this lib:
* you are using robotframework 
* your scripts is running under [Jython](http://www.jython.org/)

#### How to build this lib, to be a stand-alone .jar file
###### First time build using Maven:
* Fill Base directory with `${project_loc:automatelibrary}`
* Fill Goals with `package`
* start your build

###### Daily build using Maven:
* Fill Base directory with `${project_loc:automatelibrary}`
* Fill Goals with `package shade:shade` (we are using Maven shade plugin to build, so it will produce a standalone .jar file, so you don't have to worry about dependencies when using it)
* start your build
* it will produce 2 jars, `automatelibrary-0.0.1-SNAPSHOT.jar` and `original-automatelibrary-0.0.1-SNAPSHOT.jar` on the target folder. `automatelibrary-0.0.1-SNAPSHOT.jar` is what you need

#### How to use this lib:
* add the .jar file to your CLASSPATH (full path, until ".jar")
* to import it to your test-suite, provide the full package name. for example, if you want to use QRDecoder, import it like this:
`Library    com.cicil.robotautomatelibrary.QRDecoder`
* to use method(s), just type the method name, and type the parameter(s) needed just like typical robotframework's keyword argument. for example:
`${QRDecoded}=    decodeQRFromImgUrl    ${qrcodeSrc}`

#### If you want to extend this lib:
* if you want to create new class, create it just like creating normal Java class
* add this to your class, unless robotframework won't recognize it:
`public static final String ROBOT_LIBRARY_SCOPE = "GLOBAL";`
* you can also add Maven dependencies as much as you want
* when finished, compile it using daily build compile instruction above



Feel free to ask anything about this repo! Poke me [here](https://www.instagram.com/thekucays/) or [here](https://www.linkedin.com/in/lukirompis/) :D