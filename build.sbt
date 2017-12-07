import ResolveInternalDependencies._

lazy val lib1 = project
lazy val lib2 = project

onLoad.in(Global) ~= { f => s => resolveInternalDependenciesImpl(f(s)) }
