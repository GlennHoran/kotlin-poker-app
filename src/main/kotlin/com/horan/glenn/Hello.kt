package com.horan.glenn


import org.http4k.client.ApacheClient
import org.http4k.core.Method
import org.http4k.core.Request
import org.http4k.core.Response
import org.http4k.core.Status.Companion.INTERNAL_SERVER_ERROR
import org.http4k.core.Status.Companion.OK
import org.http4k.routing.bind
import org.http4k.routing.path
import org.http4k.routing.routes
import org.http4k.server.ApacheServer
import org.http4k.server.asServer

//make game loop - get deck, get card etc.

    fun main() {

        val deck = getDeck()
        for (d in deck) print("$d\n")
        val shuffledDeck = shuffle(deck)
        for (d in shuffledDeck) print("$d\n")


        //        routes(
//            "/hello-world" bind Method.GET to { request: Request -> helloWorld(request)},
//            "/get-poker-hand" bind Method.GET to { request: Request -> getPokerHand()},
//            "/fail" bind Method.POST to { request: Request -> Response(INTERNAL_SERVER_ERROR) }
//        ).asServer(ApacheServer(8000)).start()
    }

fun getPokerHand(): Response {
    return Response.invoke(OK).body("work in progress........")
}

fun helloWorld(request: Request): Response {
    return Response.invoke(OK).body("Hello, ${request.query(name = "name")}")
}


