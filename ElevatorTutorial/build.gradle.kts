/* (c) https://github.com/MontiCore/monticore */
plugins {
  java
  application
  id("montiarc-jsim") version "7.8.0-SNAPSHOT"
  id("cd2pojo") version "7.8.0-SNAPSHOT"
}

application {
  if (hasProperty("mainClass")) {
    mainClass.set("${property("mainClass")}")
  } else {
    mainClass.set("elevator.DeployRestElevatorSystem")
  }
}

repositories {
  maven {
    url = uri("https://nexus.se.rwth-aachen.de/content/groups/public/")
  }
}

tasks.compileCd2pojo {
  useClass2Mc.set(true)
}

tasks.compileMontiarc {
  useClass2Mc.set(true)
}

tasks.compileTestCd2pojo {
  useClass2Mc.set(true)
}

tasks.compileTestMontiarc {
  useClass2Mc.set(true)
}