# lambda-drools project

Setup aws-cli

https://docs.aws.amazon.com/lambda/latest/dg/gettingstarted-awscli.html

setup the aws execution role either by using the management console or the command line

add the execution role to the system variable
 ex/
 LAMBDA_ROLE_ARN="arn:aws:iam::1234567890:role/lambda-role"




./mvnw package -Dquarkus.package.type=uber-jar

# Amazon Lambda Integration

> :warning: **INCOMPATIBLE WITH DEV MODE**: Amazon Lambda Binding is not compatible with dev mode yet!


Guide: https://quarkus.io/guides/amazon-lambda







