#!/usr/bin/env fish

curl -X POST http://localhost:8080/api/employees -H "Content-Type: application/json" -d "{\"name\":\"name01\"}"
curl -X POST http://localhost:8080/api/employees -H "Content-Type: application/json" -d "{\"name\":\"name02\"}"
curl -X POST http://localhost:8080/api/employees -H "Content-Type: application/json" -d "{\"name\":\"name03\"}"
curl -X POST http://localhost:8080/api/employees -H "Content-Type: application/json" -d "{\"name\":\"name04\"}"
curl -X POST http://localhost:8080/api/employees -H "Content-Type: application/json" -d "{\"name\":\"name05\"}"
