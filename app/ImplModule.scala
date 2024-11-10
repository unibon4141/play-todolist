import com.google.inject.AbstractModule
import usecase.src.main.scala.usecase.unit.task.{AddTaskUsecase, AddTaskUsecaseImpl}

class ImplModule  extends  AbstractModule {
  override def configure(): Unit = {
    // usecase
    bind(classOf[AddTaskUsecase]).to(classOf[AddTaskUsecaseImpl]).asEagerSingleton()

    //repository

  }
}
