#!/bin/bash
cd `dirname $0`/dist
export RESTO_VALID_ACCESS='true'
java -jar TokoBukuApp.jar
