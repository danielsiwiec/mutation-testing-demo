# Pitest mutation testing demo
This is to showcase some simple scenarios in which mutation testing is helpful.

## Prerequisites
- jdk 1.8

## Running
`./gradlew pitest`

## Viewing the report
Open `build/reports/pitest/xxx/index.html` where *xxx* is the folder with the timestamp

## How to read the output?
The output says `Generated 3 mutations Killed 1 (33%)`. This means that 2 modifications of the codebase did not cause the tests to fail. In other words - introduced defects were not caught by the tests and it is obviously not good.

It is worth pointing out, that the code coverage is at 100%.

## Why is this a big deal?
Surviving mutations mean that introduced **defects** in the code were not caught by the unit tests despite 100% code coverage!
This can be confirmed manually, following these simple steps:

1. Go to `PoorlyTestedAdder` and `FalseCoverage`
2. Swap the code as instructed in the files, clearly introducting defects this way
3. Run `./gradlew test`
4. See the tests pass

The conclusion from the above is that the defects were not caught by the tests, which is a bad sign.    

## How to fix?
Go to `PoorlyTestedAdderTest` and `FalseCoverageTest`, uncomment both tests and re-run `./gradlew pitest`.
You will now see `Generated 3 mutations Killed 3 (100%)`, which means that all mutations (introduced code defects) were caught by the tests. To confirm this in a more clear fashion, repeat steps from the previous section (introducing the defects and running tests). You will notice that the newly added tests failed when the defects were introduced, meaning they prevented regression defects and did their job.

## Conclusion
Mutation testing, as displayed above, can be used to qualify the test suite (not the actual code) and confirm they provide a safety net to the software instead of just a false sense of security, even though the test coverage might be high.
