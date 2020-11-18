// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kjt/Eclipse_Projects/play-scala/play-scala-starter-example/conf/routes
// @DATE:Tue Nov 17 16:44:50 CST 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
