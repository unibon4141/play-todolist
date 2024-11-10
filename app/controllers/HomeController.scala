package controllers

import javax.inject._
import play.api._
import play.api.mvc.{AbstractController, _}
import usecase.src.main.scala.usecase.unit.task.{AddTaskUsecase, AddTaskUsecaseInputData}

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(  cm: ControllerComponents,addTaskUsecase:AddTaskUsecase) extends AbstractController(cm) {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index() = Action { implicit request: Request[AnyContent] =>
    val input = AddTaskUsecaseInputData("title", "content")
    addTaskUsecase.execute(input) match {
      case Right(_) => Ok("success")
      case Left(e) => BadRequest(e.getMessage)
    }
  }
}
