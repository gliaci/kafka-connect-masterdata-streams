#!/usr/bin/env bash

echo
echo "Create topic mysql.masterdata.EXCHANGE_RATE"
echo "------------------------------------"
docker exec -t zookeeper kafka-topics --create --bootstrap-server kafka:9092 --replication-factor 1 --partitions 5 --topic mysql.masterdata.EXCHANGE_RATE

echo
echo "List topics"
echo "-----------"
docker exec -t zookeeper kafka-topics --list --bootstrap-server kafka:9092