package controllers

import javax.inject._

import play.api.mvc._

// kjt - imports for web service client call
import scala.concurrent.Future
import scala.concurrent.duration._
import play.api.libs.ws._
import play.api.http.HttpEntity

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents, ws: WSClient) (implicit assetsFinder: AssetsFinder)
  extends AbstractController(cc) {

  // kjt - adding a WebService Client call to make a call to my api
  val request: WSRequest = ws.url("http://host.docker.internal:9001/v1/posts")
  
  val complexRequest: WSRequest =
  request
    .addHttpHeaders("Accept" -> "application/json")
    .withRequestTimeout(10000.millis)
  
  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index = Action {
    
    // kjt - make the call to the downstream api
    val futureResponse: Future[WSResponse] = complexRequest.get()
    
    Ok(views.html.index("Your new application is ready."))
  }

}
