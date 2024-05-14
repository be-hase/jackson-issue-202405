# jackson-issue-202405

https://github.com/FasterXML/jackson-module-kotlin/issues/775

## Reproduction step

```shell
./gradlew clean test
```

You can confirm that test fails because a runtime exception is raised at `:jackson215:test` task.
