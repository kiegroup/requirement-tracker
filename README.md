# Requirements Tracker

This repo contains a simple outline project that:
1) captures requirements from [pivotal tracker](https://www.pivotaltracker.com/)
2) executes drools rules
3) matches when a requirement has been implemented by a rule
4) prints a report in "report.txt" to show these connects

## Assumptions

1) that the ticket has been labeled with the rule name 
2) that the rule name is added to the object you are adding to the kiesession

## Running the code

Download the repo and run the Main.java class

## Uses Case

The example is based on a finacial example of deciding if someone is accepted for a loan by using a credit score

# Models

These are a set of models written in Python that are going to be used to model whether the requirements are compliant. This example uses the requirement number, the user level and whether this is true or false to classify the requirement as compliant. The values are currently random and there is a little niose added. This can be changed and expanded. A NN model is currently implemented.
