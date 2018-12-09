import kotlinx.coroutines.delay

suspend fun main(args: Array<String>) {
  fakeCompletable()

  val a = fakeSingle()
  println(a)

  val b = fakeMaybe()
  println(b)
}

suspend fun fakeCompletable() {
  delay(3000)
}

suspend fun fakeSingle(): Int {
  delay(3000)
  return 10
}

suspend fun fakeMaybe(): Int? {
  delay(3000)
  return 10
}

suspend fun sampleResult() {
  val r = runCatching {
    delay(1000)
    100
  }
  r.map { }
}