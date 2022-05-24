# SOAP consuming with Kotlin

### How to run

Install all dependencies by running

```console
./mvnw clean install
```

### How to test

Run the curl below

> :bulb: _Quick tip_
> 
> You can also import the curl into Postman and run it.

```console
curl --location --request GET 'http://localhost:8080?codAdministrativo=17000190&tipoBusca=H&tipoSolicitacao=A&deliveryCode=194848820'
```