package zio.web.http.model

sealed trait Version

object Version {
  object V1_1 extends Version
  object V2   extends Version
}
