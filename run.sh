#!/usr/bin/env bash
aws cloudformation deploy --stack-name $1 --template-file $2 --region eu-west-1
