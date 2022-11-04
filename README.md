## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.


## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.


## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).


## Appendix: How to set up JavaFX in Visual Studio Code

1. Install Visual Studio Code, JDK, and JavaFX. Extract JavaFX from the zip file and store it wherever you want to, but remember where you put it because it will be important later.
2. Install the VS Code extensions "Language Support for Java(TM)", "Extension Pack for Java", "JavaFX Support", and "Code Runner".
3. In VS Code, open the command palette (Ctrl + shift + P) and type "new Java Project". Give it a name, then hit enter.
4. Once the new window generates, go to the `JAVA PROJECTS` view (at the bottom left), expand it, then expand the next folder you see. At this point, you should see three folders: `src`, `JRE System Library`, and `Refereced Libraries`.
5. Hover on `Referenced Libraries` and click the `+` icon, then go to the location where you stored JavaFX. Open the `lib` folder and select all the jar files, then click "Select Jar Libraries".
6. Go to run (at the very top of the screen), then click "Add Configuration". In the second set of configurations (the second `{}`), type the following key-value pair. Remember to modify the file path to the path of your JavaFX installation.
```json
"vmArgs": "--module-path \"C:/Program Files/Java/javafx-sdk-19/lib\" --add-modules javafx.controls,javafx.fxml",
```
7. You're all set! Copy-paste a sample JavaFX code, then click the dropdown arrow beside the play button at the upper right corner, then click `Run Java`.
