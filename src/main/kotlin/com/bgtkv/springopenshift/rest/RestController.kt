package com.bgtkv.springopenshift.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/api/v1")
class RestController {

    @GetMapping("/")
    fun getBody(): Mono<String> {
        return Mono.just("darroy")
    }
}
