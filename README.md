# quarkus playground

## Part I: create a Quarkus Application

### install quarkus CLI to simplify
`sdk install quarkus`

### create the application scaffolding

`quarkus create app  org.acme:order-service`

## Part II: create a Quarkus Extension

### create the extension boilerplate
`quarkus create extension quarkus-echo`

## Part III: Jbang Scripting

### add Debezium Jbang Catalog

`jbang catalog add --name debezium https://github.com/kmos/debezium-catalog/blob/HEAD/jbang-catalog.json`

### initialize a Debezium instance with jbang

`jbang init -t capturing@debezium example.java`