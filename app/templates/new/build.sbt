
name := "<%= config.app.name %>"

version := "<%= config.app.version %>"

libraryDependencies ++= Seq(
  <%= config.app.dependencies.join(',\n  ') %>
)

<%= config.app.settings %>


