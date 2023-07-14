val nr1: Int = 1
val nr2: Int = 2
val a: Boolean = nr1 < nr2
val b: Boolean = nr1 == nr2
val andPred = a && b
val orPred = a || b
val xorPred = a ^ b

// n1 + n2
def sum(n1: Int, n2: Int): Int = {
  n1 + n2
}
sum(3, 5)

// function definition
def lessThan(n1: Int, n2: Int): Boolean = {
  n1 < n2
}

lessThan(100, 1000)
lessThan(500, 1000)
lessThan(1, 2)
lessThan(3, 4)

def minus(n1: Int, n2: Int)=
  n1-n2


minus(n2 = 3, n1 = 5)