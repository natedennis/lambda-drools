# lambda-drools project

SAM local: https://docs.aws.amazon.com/serverless-application-model/latest/developerguide/serverless-sam-cli-install.html

Install graal. This was tested against GraalVM CE 20.3.0 

Local Simulated Lambda

1. Build the native image: 
    ./mvnw clean install -Dnative -Dquarkus.native.container-build=true

2. sam local start-api --template target/sam.native.yaml


Steps to deploy to AWS Lambda.

1. Build the native image: 
    ./mvnw clean install -Dnative -Dquarkus.native.container-build=true

2. Login into your AWS account for your cli and make sure you have an s3 bucket you can use for deploy artifacts.

3. Package it for AWS lambda: 
    sam package --template-file target/sam.native.yaml --output-template-file packaged-native.yaml --s3-bucket <your-bucket-here>

4. Deploy it for AWS lambda: 
    sam deploy --template-file packaged-native.yaml --capabilities CAPABILITY_IAM --stack-name <your-stack-name-here>

5. Get the URL of the API Gateway exposing your lambda (see outputs): 
    aws cloudformation describe-stacks --stack-name <your-stack-name>

Hit the URL:
 curl -X POST <your-endpoint-here>/persons \                                                                    
    -H 'content-type: application/json' \
    -H 'accept: application/json' \
    -d '{"person": {"name":"John Quark", "age": 20}}'



