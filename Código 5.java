public static int safeToInt(long value) {
if (Integer.MIN_VALUE <= value &&
value <= Integer.MAX_VALUE) {
return (int) +value;
}
throw new ArithmeticException (...);
}