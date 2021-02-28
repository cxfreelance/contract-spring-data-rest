curl http://localhost:8080/contracts/search/example?status=OPEN

```json

{
    "_embedded": {
        "contracts": [
            {
                "status": "OPEN",
                "drivers": [
                    {
                        "firstName": "John",
                        "lastName": "Doe",
                        "_links": {
                            "contracts": {
                                "href": "http://localhost:8080/contracts/1{?projection}",
                                "templated": true
                            }
                        }
                    }
                ],
                "_links": {
                    "self": {
                        "href": "http://localhost:8080/contracts/1"
                    },
                    "contract": {
                        "href": "http://localhost:8080/contracts/1{?projection}",
                        "templated": true
                    }
                }
            }
        ]
    },
    "_links": {
        "self": {
            "href": "http://localhost:8080/contracts/search/example?status=OPEN"
        }
    }
}

```

curl http://localhost:8080/contracts/search/example?status=OPEN&projection=noDrivers

```json

{
    "_embedded": {
        "contracts": [
            {
                "status": "OPEN",
                "_links": {
                    "self": {
                        "href": "http://localhost:8080/contracts/1"
                    },
                    "contract": {
                        "href": "http://localhost:8080/contracts/1{?projection}",
                        "templated": true
                    }
                }
            }
        ]
    },
    "_links": {
        "self": {
            "href": "http://localhost:8080/contracts/search/example?status=OPEN&projection=noDrivers"
        }
    }
}

```
