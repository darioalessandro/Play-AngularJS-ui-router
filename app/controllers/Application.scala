package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index())
  }

  def state1 = Action {
    Ok(views.html.partials.state1())
  }

  def state2 = Action {
    Ok(views.html.partials.state2())
  }

  def state1List = Action {
    Ok(views.html.partials.state1_list())
  }

  def state2List = Action {
    Ok(views.html.partials.state2_list())
  }



}