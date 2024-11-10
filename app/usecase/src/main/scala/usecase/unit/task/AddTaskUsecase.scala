package usecase.src.main.scala.usecase.unit.task

import javax.inject.Inject

case class AddTaskUsecaseInputData(
  title: String,
  content: String
)


trait AddTaskUsecase {
  def execute(input: AddTaskUsecaseInputData): Either[Throwable, Unit]
}


class AddTaskUsecaseImpl @Inject() extends AddTaskUsecase {
   def execute(input: AddTaskUsecaseInputData): Either[Throwable, Unit] = {
    Right(())
  }

}
