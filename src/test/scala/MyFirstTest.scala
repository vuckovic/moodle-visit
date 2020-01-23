import io.gatling.core.Predef._
import io.gatling.http.Predef._

class MyFirstTest extends Simulation {

  // 1. Http config
  val httpConf = http.baseUrl(url="http://localhost:8080/app/").header(name="Accept", value="application/json")

  // 2. Scenario definition
  val scn = scenario(scenarioName = "My First Test").exec(http(requestName = "Get All Games").get("videogames"))

  // 3. Load scenario
  setUp(scn.inject(atOnceUsers(users = 1))).protocols(httpConf)
}
