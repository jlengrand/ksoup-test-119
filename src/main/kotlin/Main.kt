package nl.lengrand

import com.fleeksoft.ksoup.Ksoup
import com.fleeksoft.ksoup.network.parseGetRequest
import com.fleeksoft.ksoup.network.parseGetRequestBlocking
import kotlinx.coroutines.runBlocking
import kotlin.time.measureTime

fun main() {

    val bGithubTime = measureTime {
        val doc = Ksoup.parseGetRequestBlocking(url = "https://github.com/jlengrand")
        println("title: ${doc.title()}")
    }
    println("time: $bGithubTime to fetch GitHub page blocking")

    val bWikiTime = measureTime {
        val doc = Ksoup.parseGetRequestBlocking(url = "https://en.wikipedia.org/wiki/Wikipedia:Getting_to_Philosophy")
        println("title: ${doc.title()}")
    }
    println("time: $bWikiTime to fetch Wikipedia page blocking")


    val bBlogTime = measureTime {
        val doc = Ksoup.parseGetRequestBlocking(url = "https://lengrand.fr")
        println("title: ${doc.title()}")
    }
    println("time: $bBlogTime to fetch blog page blocking")

    println("////")

    val githubTime = measureTime {
        runBlocking {
            val doc = Ksoup.parseGetRequest(url = "https://github.com/jlengrand")
            println("title: ${doc.title()}")
        }
    }
    println("time: $githubTime to fetch GitHub page blocking")

    val wikiTime = measureTime {
        runBlocking {
            val doc = Ksoup.parseGetRequest(url = "https://en.wikipedia.org/wiki/Wikipedia:Getting_to_Philosophy")
            println("title: ${doc.title()}")
        }
    }
    println("time: $wikiTime to fetch Wikipedia page")

    val blogTime = measureTime {
        runBlocking {
            val doc = Ksoup.parseGetRequest(url = "https://lengrand.fr")
            println("title: ${doc.title()}")
        }
    }
    println("time: $blogTime to fetch blog page")

}