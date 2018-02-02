class Foo {
  public static final int REQUESTS_PER_MINUTE = 10
  def 'foo bar'() {
    (REQUESTS_PER_MINUTE * 10).times { i ->
      println i
    }
  }
}
