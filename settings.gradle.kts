
rootProject.name = "kotlinWithJava"
include("src:main:moduleJava")
findProject(":src:main:moduleJava")?.name = "moduleJava"
include("moduleJava")
