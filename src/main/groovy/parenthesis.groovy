def transit(tranId) {
    [
            from: { fromId ->
                [
                        to: { toId ->
                            println "transit ${tranId} from ${fromId} to ${toId}"
                        }
                ]

            }
    ]
}

transit "jiraId" from "a" to "b"
transit("jiraId").from("a").to("b")

def transit(tranId, method) {
    [
            from: { fromId ->
                [
                        to: { toId ->
                            println "transit ${tranId}, ${method} from ${fromId} to ${toId}"
                        }
                ]

            }
    ]
}
transit "jiraId","good method" from "a" to "b"