def isOdd(n: Int): Boolean = {
  if (n % 2 == 0) {
    false
  } else {
    true
  }
}

// if (boolean-condition) { do-something-if-true } else { do-something-if-false }

isOdd(4)
isOdd(5)

def prizeForGrade(grade: Int): String = {
  if (grade >= 9) {
    "1st"
  } else if (grade >= 7) {
    "2nd"
  } else {
    "mention"
  }
}


prizeForGrade(10)
prizeForGrade(9)
prizeForGrade(8)
prizeForGrade(7)
prizeForGrade(6)