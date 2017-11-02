# Pitest mutation testing demo

## Prerequisites
- jdk 1.8
- gradle

## Running
`./gradlew pitest`

## Viewing the report
Open `build/reports/pitest/xxx/index.html` where *xxx* is the folder with the timestamp

## How to read the output?
The output says `Generated 3 mutations Killed 1 (33%)`. This means that 2 modifications of the codebase did not cause the tests to fail. In other words - introduced defects were not caught by the tests and it is obviously not good.

## How to fix?
Go to `PoorlyTestAdderTest` and `FalseCoverageTest`, uncomment both tests and re-run `./gradlew pitest`.
You will now see `Generated 3 mutations Killed 3 (100%)`, which means that all mutations (introduced code defects) were caught by the tests.