# Ignition SDK

## Example Modules

### Gradle Examples

## The Module Build System

These examples utilize Gradle and our [Gradle Plugin](https://github.com/inductiveautomation/ignition-module-tools).  Gradle is mature and capable, offering different tradeoffs in terms of performance, ease of customization, language support, etc.  If you prefer XML configuration, take a look at Maven.  If you prefer declarative programming-language based configuration, check out Gradle.  Inductive Automation uses Gradle to build Ignition and our own modules with the same open source plugin linked above.

The Gradle Plugin is published to the [Gradle Plugin Portal](https://plugins.gradle.org/plugin/io.ia.sdk.modl), and may be used simply by applying the plugin to your gradle project.


## General Requirements

These requirements generally apply to Gradle build tools.

* Java Development Kit (JDK) 11 installed. You can download it on the [Java SDK Downloads](http://www.oracle.com/technetwork/java/javase/downloads/index-jsp-138363.html) page.  Licensed/TCK tested JDK vendors such as Adoptium, Azul Zulu, etc, are generally suitable JDKs as well.
* A running, 8.0+ version of Ignition to test your module in. If you don't already have Ignition installed head to the Inductive Automation [downloads](https://www.inductiveautomation.com/downloads/) page, download the correct package for your system and follow the installation instructions to get a gateway up and running.
* For development convenience, you may want to allow unsigned modules. Open the `ignition.conf` file in the `data/` directory, then in the `wrapper.java.additional` section add a line like: `wrapper.java.additional.7=-Dignition.allowunsignedmodules=true` (the index does not matter).

## Getting Started

* Once you have configured your developer gateway, make sure [git](https://git-scm.com/downloads) is installed and clone this repo to a directory of your choice:
    `git clone https://github.com/inductiveautomation/ignition-sdk-training.git`

* Using your IDE of choice, you should be able to create or open any of these included Example Modules through the _settings.gradle.kts_, file located in the root of each example.  Upon importing this project into your IDE, it should download (if auto-import is on) necessary dependencies from the Inductive Automation artifact repository. Dependencies are managed through Maven and are cached to your local environment after they are downloaded.

## Running Gradle Examples

For instructions on how to build with the Gradle plugin, take a look at the documentation on the [Gradle Plugin](https://github.com/inductiveautomation/ignition-module-tools/tree/master/gradle-module-plugin) repository.


## Javadocs
Head over to our [wiki page](https://github.com/inductiveautomation/ignition-sdk-examples/wiki/Javadocs-&-Notable-Api-Changes) for a listing of 8.0+ javadocs.
