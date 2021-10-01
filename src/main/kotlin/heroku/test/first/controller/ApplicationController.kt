package heroku.test.first.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDate
import java.time.LocalDateTime

@RestController
class ApplicationController {

    @GetMapping("/test")
    fun testGet(): String {
        return "Hello! It's ${LocalDateTime.now()} now."
    }
}