#!/bin/bash

# Stop and remove existing containers with volumes
docker-compose -f ./docker-compose.yml down -v

# Start new containers
docker-compose -f ./docker-compose.yml up -d