import com.tuplejump.sbt.yeoman._

name := "<%= config.app.name %>"

version := "<%= config.app.version %>"

libraryDependencies ++= Seq(
  <%= config.app.dependencies.join(',\n  ') %>
)

// issue https://github.com/tuplejump/play-yeoman/issues/36 ?
scalacOptions ++= Seq(
  "-feature",
  "-language:reflectiveCalls")

<%= config.app.settings %> ++ yeomanSettings



