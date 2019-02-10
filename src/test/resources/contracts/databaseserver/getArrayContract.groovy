package databaseserver

import org.springframework.cloud.contract.spec.Contract

[
        Contract.make {
            description 'Should return 200'
            request {
                method POST()
                url("/get")
                headers {
                    contentType("application/json;charset=UTF-8")
                }
            }
            response {
                status OK()
                body(file("getBody.json"))
            }
        }
]