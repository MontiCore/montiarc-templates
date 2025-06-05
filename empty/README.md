
### Checking, Building, And Simulating

For running and building the project you need Java 11.

Either install exactly Gradle 7.6 or add a Gradle wrapper with that version by running:

```bash
./init-gradlew[.bat]
```

To check the models and build the simulator run:
```bash
./gradlew[.bat] build
```

To run the simulation execute: 
```bash
./gradlew[.bat] run -PmainClass="pkg.DeployHelloWorld"
```

### Further Information

* [MontiArc documentation](https://monticore.github.io/montiarc)
  * [Setup](https://monticore.github.io/montiarc/v7.8/GettingStarted/Setup)
  * [Contributing](https://monticore.github.io/montiarc/v7.8/Contributing)
  * [FAQ](https://monticore.github.io/montiarc/v7.8/FAQ)
* [Publications about MBSE and MontiArc](https://www.se-rwth.de/publications/)